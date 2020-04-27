package com.csdj.examines.controler;

import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("message")
public class MessageServiceController {
    @Autowired
    private MessageService service;
    @RequestMapping("loadInfo")
    public Object loadUserInfo(Userinfo userinfo, Integer page, Integer limit){
        PageInfo<Userinfo> pageInfo=service.loadUserInfo(userinfo,page,limit);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getSize());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("noteByUser")
    public Object noteByUser(Userinfo userinfo, Integer page, Integer limit){
        PageInfo<Userinfo> pageInfo=service.NoteByUserinfo(userinfo,page,limit);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getSize());
        map.put("data",pageInfo.getList());
        return map;
    }
}
