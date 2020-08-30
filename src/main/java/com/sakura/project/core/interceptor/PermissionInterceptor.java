package com.sakura.project.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sakura.project.common.enums.EnumInterceptorDefineParams;
import com.sakura.project.common.util.CommonsUtil;
import com.sakura.project.entity.MgLog;
import com.sakura.project.mapper.generator.MgLogGeneratorMapper;

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

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        return true;
    }

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
}
