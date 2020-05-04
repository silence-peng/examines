package com.csdj.examines.controler;

import com.csdj.examines.pojo.Registertype;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 新增受检人员控制器
 */
@Controller
@RequestMapping("addUser")
public class AddUserController {
    @Autowired
    private AddUserService userInfoService;

    /**
     * 页面跳转
     * @param page
     * @return string
     */
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    /**
     *新增受检人员
     * @param userinfo:新增对象
     * @return string
     */
    @RequestMapping("addUserInfo")
    @ResponseBody
    public String addUser(Userinfo userinfo){
        System.out.println(userinfo);
        int result = userInfoService.addUserInfo(userinfo);
        if (result>0){
            return "ok";
        }else {
            return "no";
        }
    }

    /**
     * 获取登记类型
     * @return List<Registertype>
     */
    @RequestMapping("getRegosterType")
    @ResponseBody
    public List<Registertype> getRegosterType(){
        List<Registertype> registertypes = userInfoService.getRegosterType();
        return registertypes;
    }
}
