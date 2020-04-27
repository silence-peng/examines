package com.csdj.examines.controler;

import com.csdj.examines.pojo.Suggest;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import com.github.pagehelper.PageInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")
public class MessageServiceController {
    @Autowired
    private MessageService service;
    @RequestMapping("loadInfo")
    public Object loadUserInfo(String name, Date startdate,Date enddate){
        return service.loadUserInfo(name,startdate, enddate);
    }
    @RequestMapping("noteByUser")
    @ResponseBody
    public Object noteByUser(Userinfo userinfo,Integer page,Integer limit){
        PageInfo<Userinfo> userinfos =service.NoteByUserinfo(userinfo,page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", userinfos.getTotal());
        map.put("data", userinfos.getList());
        return map;
    }
}
