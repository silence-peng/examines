package com.csdj.examines.controler;

import com.csdj.examines.pojo.Admin;
import com.csdj.examines.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {
    @Autowired
    private AdminService service;
    @RequestMapping("checkLogin")
    public Object checkLogin(Admin admin, HttpSession session){

        Admin admin1=service.checkLogin(admin);
        if (admin1!=null){
            session.setAttribute("admin", admin1);
            System.out.println(session.getAttribute("admin"));
            return "ok";
        }
        return false;
    }
}
