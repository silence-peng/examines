package com.csdj.examines.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfiguter implements WebMvcConfigurer {
    @Autowired
    private HandlerInterceptor loginIntercepoter;


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginIntercepoter).
                addPathPatterns("/check");
    }
}
