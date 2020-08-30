package com.sakura.project.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sakura.project.common.enums.EnumInterceptorDefineParams;
import com.sakura.project.common.enums.EnumJsonResultMsg;
import com.sakura.project.common.util.Assert;
import com.sakura.project.common.util.CommonConstant;
import com.sakura.project.common.util.JwtUtil;
import com.sakura.project.common.util.JwtUtil.JwtUser;
import com.sakura.project.common.util.ObjectTools;
import com.sakura.project.mapper.generator.MgUserInfoGeneratorMapper;

/**
 * Created by 李七夜 on 2020/5/14 15:49
 * 登录校验拦截器
 * @author 李七夜
 */
public class TicketInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private MgUserInfoGeneratorMapper mgUserInfoGeneratorMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //从请求头中获取登录的token,如果没有传入直接返回提示用户登录
        String userToken = request.getHeader("user-token");
        Assert.isTrue(ObjectTools.isNotBlank(userToken), EnumJsonResultMsg.USER_NOT_LOGIN);

        //解密JWT,如果解密失败,直接返回提示用户
        JwtUser jwtUser = JwtUtil.parseJwt(userToken);
        Assert.isTrue(ObjectTools.isNotBlank(jwtUser), EnumJsonResultMsg.USER_TOKEN_ERR);

        //从缓存中取出token,判断是否过期
        String redisToken = redisTemplate.opsForValue()
                .get(StringUtils.join(CommonConstant.REDIS_USER_KEY, jwtUser.getUserId()));
        Assert.isTrue(ObjectTools.isNotBlank(redisToken), EnumJsonResultMsg.USER_LOGIN);

        //将userId放到request内置参数中,方便后面方法获取
        request.setAttribute(EnumInterceptorDefineParams.USER_ID.getName(), jwtUser.getUserId());
        return true;
    }
}
