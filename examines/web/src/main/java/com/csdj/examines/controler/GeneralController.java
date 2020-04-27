package com.csdj.examines.controler;

import com.csdj.examines.dao.GeneralMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.GeneralService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/General")
public class GeneralController {
    @Autowired
    private GeneralService service;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/getGeneraluserinfo")
    @ResponseBody
    public Map<String, Object> cx(Integer userid, String creatDateone, String creatDatetwo, String mname, String mcard, String fname, String fcard, String result, Integer page,Integer limit){

        List<Userinfo> userinfo=service.getUserInfo(userid, creatDateone, creatDatetwo, mname, mcard, fname, fcard, result, page, limit);
        int getCount=service.getUserInfoCount(userid, creatDateone, creatDatetwo, mname, mcard, fname, fcard, result);
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count", getCount);
        map.put("data", userinfo);
        return map;
    }

    @RequestMapping("/adduserid")
    @ResponseBody
    public String adduerid(Integer userid, HttpSession session){
        System.out.println(userid);
        session.setAttribute("userid",userid);
        return "a";
    }

}
