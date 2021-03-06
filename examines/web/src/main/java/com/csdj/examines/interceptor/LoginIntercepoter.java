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
        if(admin.getUqx()==1){
            return true;
        }else if(admin.getUqx()==2){
            if (request.getServletPath().contains("home") || request.getServletPath().contains("Essentialinfo")|| request.getServletPath().contains("General") || request.getServletPath().contains("Bchao") || request.getServletPath().contains("FindBchao") || request.getServletPath().contains("image") || request.getServletPath().contains("UploadingB")){
                return true;
            }else{
                return false;
            }
        }else if(admin.getUqx()==3){
            if (request.getServletPath().contains("Prove") || request.getServletPath().contains("check") || request.getServletPath().contains("home") || request.getServletPath().contains("Essentialinfo")|| request.getServletPath().contains("General") ||request.getServletPath().contains("-f") ||request.getServletPath().contains("-m")){
                return true;
            }else{
                return false;
            }
        }else if(admin.getUqx()==4){
            if (request.getServletPath().contains("Note") || request.getServletPath().contains("home") || request.getServletPath().contains("Essentialinfo")|| request.getServletPath().contains("General") ||request.getServletPath().contains("message")){
                return true;
            }else{
                return false;
            }
        }else if(admin.getUqx()==5){
            if ( request.getServletPath().contains("home") || request.getServletPath().contains("Essentialinfo")|| request.getServletPath().contains("General") || request.getServletPath().contains("newRecord") || request.getServletPath().contains("tion") || request.getServletPath().contains("assesAndOther") || request.getServletPath().contains("Assess") || request.getServletPath().contains("addUser")){
                return true;
            }else{
                /*request.getRequestDispatcher("message").forward(request, response);*/
                return false;
            }
        }
        return true;
    }
}
