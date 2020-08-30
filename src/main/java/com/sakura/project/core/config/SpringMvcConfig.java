package com.sakura.project.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sakura.project.core.interceptor.PermissionInterceptor;
import com.sakura.project.core.interceptor.TicketInterceptor;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/25 16:59
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private ServerProperties serverProperties;
    @Autowired
    private TicketInterceptor ticketInterceptor;
    @Autowired
    private PermissionInterceptor permissionInterceptor;

    @Bean
    public TicketInterceptor ticketInterceptor() {
        return new TicketInterceptor();
    }

    @Bean
    public PermissionInterceptor permissionInterceptor() {
        return new PermissionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加登录拦截器
        registry.addInterceptor(ticketInterceptor)
                .excludePathPatterns(serverProperties.getError().getPath())
                .addPathPatterns("/**")
                .excludePathPatterns("/mg/login/**")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");

        //添加权限校验拦截器
        registry.addInterceptor(permissionInterceptor)
                .excludePathPatterns(serverProperties.getError().getPath())
                .addPathPatterns("/**")
                .excludePathPatterns("/mg/login/**")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");

    }
}
