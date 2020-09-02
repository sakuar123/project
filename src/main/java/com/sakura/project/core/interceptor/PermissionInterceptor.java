package com.sakura.project.core.interceptor;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.common.collect.Maps;
import com.sakura.project.common.enums.EnumInterceptorDefineParams;
import com.sakura.project.common.enums.EnumJsonResultMsg;
import com.sakura.project.common.enums.EnumRole;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonConstant;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.entity.MgLog;
import com.sakura.project.mapper.generator.MgLogGeneratorMapper;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * 权限拦截器
 * Created by 李七夜 on 2020/8/25 16:28
 */
@Slf4j
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private MgLogGeneratorMapper mgLogGeneratorMapper;
    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 在请求接口之前,登录拦截器之后,校验用户的权限,根据用户请求的url判断是包含该权限
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //从request中取出userId,先进行简单的非空校验
        int userId = CommonsUtil.parseInt(request.getAttribute("userId").toString());
        if (userId == 0 || !(handler instanceof HandlerMethod)) {
            CommonsUtil.returnResult(JsonResult.of(EnumJsonResultMsg.USER_NO_QX, Maps.newHashMap()), response);
            return false;
        }

        //获取用户所对应的角色id,如果是admin,不需要校验权限,直接放行
        Integer roleId = getRoleIdByUser(userId);
        if (EnumRole.ADMIN.getCode().equals(roleId)) {
            return true;
        }

        //请求的url
        String[] requestUrls = getRequestUrls(handler);

        //从缓存中取出权限数组,用逗号分割,在转成list集合
        String permissions = redisTemplate.opsForValue()
                .get(StringUtils.join(CommonConstant.REDIS__PERMISSION, roleId));
        Assert.isTrue(ObjectTools.isNotBlank(permissions), EnumJsonResultMsg.USER_NO_QX);
        //权限数组转成list集合,方便判断
        List<String> permissionList = Arrays.asList(permissions.split(","));

        //多权限判断,少一个都不放过
        for (String requestUrl : requestUrls) {
            if (!permissionList.contains(requestUrl)) {
                CommonsUtil.returnResult(JsonResult.of(EnumJsonResultMsg.USER_NO_QX, Maps.newHashMap()), response);
                return false;
            }
        }
        return true;
    }

    /**
     * 试图渲染之后,添加用户行为日志
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        //在完成视图渲染之后触发的操作,记录日志
        if (!(handler instanceof HandlerMethod)) {
            return;
        }
        int userId = CommonsUtil
                .parseInt(String.valueOf(request.getAttribute(EnumInterceptorDefineParams.USER_ID.getName())), 0);
        if (userId == 0) {
            return;
        }
        if (request.getMethod().equals(RequestMethod.GET.toString())) {
            return;
        }
        try {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            ApiOperation apiOperation = handlerMethod.getMethodAnnotation(ApiOperation.class);
            mgLogGeneratorMapper.insertSelective(
                    MgLog
                            .builder()
                            .userDescription(apiOperation.value())
                            .userOperating(apiOperation.value())
                            .userId(userId)
                            .userIp(CommonsUtil.getLocalIP())
                            .build()
            );
        } catch (Exception e) {
            log.error("添加系统日志时异常:{}", e.getMessage());
        }
    }

    private Integer getRoleIdByUser(Integer userId) {
        return mgUserInfoGeneratorMapper.selectByPrimaryKey(userId).getRoleId();
    }

    private String[] getRequestUrls(Object handler) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        RequestMapping requestMapping = handlerMethod.getMethodAnnotation(RequestMapping.class);
        return Objects.requireNonNull(requestMapping).value();
    }
}
