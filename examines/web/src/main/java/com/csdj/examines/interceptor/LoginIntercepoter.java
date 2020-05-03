package com.csdj.examines.interceptor;


import com.csdj.examines.pojo.Admin;
import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Case;
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
        if (null==request.getSession().getAttribute("admin")){
            response.sendRedirect("login");
            return false;
        }
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        System.out.println(request.getServletPath());
       /* if(admin.getUqx()==1){
            return true;
        }else if(admin.getUqx()==2){
            if (request.getServletPath().contains("Note") || request.getServletPath().contains("home") || request.getServletPath().contains("Essentialinfo")){
                return true;
            }else{
                response.sendRedirect("/message.html");
                return false;
            }
        }else if(admin.getUqx()==3){
            if (request.getServletPath().contains("Note")){
                return true;
            }else{
                response.sendRedirect("/message.html");
                return false;
            }
        }else if(admin.getUqx()==4){
            if (request.getServletPath().contains("Note")){
                return true;
            }else{
                response.sendRedirect("/message.html");
                return false;
            }
        }else if(admin.getUqx()==5){
            if (request.getServletPath().contains("Note")){
                return true;
            }else{
                response.sendRedirect("/message.html");
                return false;
            }
        }*/
        return true;
    }
}
