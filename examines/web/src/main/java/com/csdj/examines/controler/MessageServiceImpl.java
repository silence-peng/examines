package com.csdj.examines.controler;

import com.csdj.examines.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("message")
public class MessageServiceImpl {
    @Autowired
    private MessageService service;
    @RequestMapping("loadInfo")
    public Object loadUserInfo(String name, Date startdate,Date enddate){
        return service.loadUserInfo(name,startdate, enddate);
    }
}
