package com.csdj.examines.controler;

import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Yxadvise;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckProveService;
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
@RequestMapping("checkProve")
public class CheckProveServiceController {
    @Autowired
    private CheckProveService checkProveService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("getUserByuserid")
    @ResponseBody
    public Userinfo getUser(HttpSession session){
        session.setAttribute("userid",2020122412);
        Userinfo userinfo =checkProveService.getUserByUserid((Integer) session.getAttribute("userid"));
        return userinfo;
    }
    @RequestMapping("getYxAdvise")
    @ResponseBody
    public List<Yxadvise> getYxAdvise(){
        List<Yxadvise> yxadvises =checkProveService.getYxAdvise();
        return yxadvises;
    }
    @RequestMapping("getYxResult")
    @ResponseBody
    public Yxcheckresult getYxResultByUserid(Integer sex,HttpSession session){
        session.setAttribute("userid",2020122412);
        Yxcheckresult yxcheckresult =checkProveService.getYxResultByUserid((Integer) session.getAttribute("userid"),sex);
        return yxcheckresult;
    }

}
