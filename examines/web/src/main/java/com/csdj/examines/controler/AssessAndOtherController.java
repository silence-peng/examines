package com.csdj.examines.controler;

import com.csdj.examines.pojo.Assess;
import com.csdj.examines.pojo.Suggest;
import com.csdj.examines.pojo.Suggestd;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.AssessAndOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("assesAndOther")
public class AssessAndOtherController {
    @Autowired
    private AssessAndOtherService assessAndOtherService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("getUser")
    @ResponseBody
    public Userinfo getUser(HttpSession session){
        Userinfo userinfo = assessAndOtherService.getUserOne((Integer)session.getAttribute("userid"));
        return userinfo;
    }
    @RequestMapping("getSuggest")
    @ResponseBody
    public Object getSuggest(){
        List<Suggest> suggests =assessAndOtherService.getAllSuggest();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", suggests);
        return map;
    }
    @RequestMapping("getSuggestd")
    @ResponseBody
    public List<Suggestd> getSuggestd(){
        List<Suggestd> suggestds =assessAndOtherService.getAllSuggestD();
        return suggestds;
    }
    @RequestMapping("addAssess")
    @ResponseBody
    public String addAssess(Assess assess){
        int result =assessAndOtherService.addAssess(assess);
        if (result>0){
            return "ok";
        }
        return "no";
    }
}
