package com.csdj.examines.controler;

import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Yxadvise;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckProveService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 婚检证明控制器
 */
@Controller
@RequestMapping("/checkProve")
public class CheckProveController {
    @Autowired
    private CheckProveService checkProveService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("getUserByuserid")
    @ResponseBody
    public Userinfo getUser(HttpSession session){
        System.out.println( session.getAttribute("userid"));
        Userinfo userinfo =checkProveService.getUserByUserid((Integer) session.getAttribute("userid"));
        System.out.println(userinfo);
        return userinfo;
    }
    @RequestMapping("getYxAdvise")
    @ResponseBody
    public List<Yxadvise> getYxAdvise(){
        List<Yxadvise> yxadvises =checkProveService.getYxAdvise();
        System.out.println(yxadvises);
        return yxadvises;
    }
    @RequestMapping("getAdviseArr")
    @ResponseBody
    public String getAdviseArr(Integer sex,HttpSession session){
        System.out.println( session.getAttribute("userid"));
        String adviseArr =checkProveService.getAdviseArr((Integer) session.getAttribute("userid"),sex);
        System.out.println(adviseArr);
        return adviseArr;
    }
    @RequestMapping("getYxResult")
    @ResponseBody
    public Yxcheckresult getYxResultByUserid(Integer sex,HttpSession session){
        System.out.println( session.getAttribute("userid"));
        Yxcheckresult yxcheckresult =checkProveService.getYxResultByUserid((Integer) session.getAttribute("userid"),sex);
        System.out.println(yxcheckresult);
        return yxcheckresult;
    }
    @RequestMapping("save")
    @ResponseBody
    public String save(String arr, Integer isabnormal, String abnormalities, Integer resultid){
        int result = checkProveService.save(arr,isabnormal,abnormalities,resultid);
        if (result>0){
            return "ok";
        }
        return "no";
    }


}
