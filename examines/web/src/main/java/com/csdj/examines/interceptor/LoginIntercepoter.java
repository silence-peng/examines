package com.csdj.examines.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class LoginIntercepoter implements HandlerInterceptor {

    /**
     * 进入controller层之前拦截请求
     * @param
     * @return
     * @throws Exception
     */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        System.out.println(request.getSession().getAttribute("admin"));
        if (null==request.getSession().getAttribute("admin")){
            response.sendRedirect("login");
            return false;
        }
        return true;
    }
}
