package com.csdj.examines.controler;

import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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
    public Object loadUserInfo(Userinfo userinfo, Integer page, Integer limit){
        PageInfo<Userinfo> pageInfo=service.loadUserInfo(userinfo.getFname(),userinfo.getFbirthdate(),
                userinfo.getMbirthdate(),page,limit);
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
    @RequestMapping("/sendMessage")
    public Object sendMessage(@RequestBody Map<String,Object> obj) throws IOException {
        List<String> phone= (List<String>) obj.get("phone");
        List<String> text= (List<String>) obj.get("text");
        System.out.println(phone);
        System.out.println(text);
        Integer result=0;
        for (int i=0;i<phone.size();i++){
            result +=service.sendMessage(phone.get(i),text.get(i));
        }
        System.out.println(result);
        return result;
    }
}
