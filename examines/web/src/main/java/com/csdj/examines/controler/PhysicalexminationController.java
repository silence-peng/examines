package com.csdj.examines.controler;

import com.csdj.examines.pojo.Healthcheckup;
import com.csdj.examines.service.Physicalexminationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Physicalexmination")
public class PhysicalexminationController {

    @Autowired
    private Physicalexminationservice service;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/get")
    @ResponseBody
    public Healthcheckup get(HttpSession session,Integer sex){
        Integer userid= (Integer) session.getAttribute("userid");
        Healthcheckup healthcheckup=service.getHealthcheck(userid,sex);

        return healthcheckup;
    }

    @RequestMapping("/updatehealthcheck")
    @ResponseBody
    public String  update(Healthcheckup healthcheckup){
        System.out.println(healthcheckup);

        int a=service.updateheal(healthcheckup);
        if (a>0){
            return "a";
        }
        return  null;
    }

}
