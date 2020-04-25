package com.csdj.examines.controler;

import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.ImageService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 影像控制器
 */
@Controller
@RequestMapping("image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("getUser")
    @ResponseBody
    public Map<String,Object> getUser(Userinfo userinfo,Integer page,Integer limit){
        PageInfo<Userinfo> pages = imageService.getUser(userinfo,page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pages.getTotal());
        map.put("data", pages.getList());
        return map;
    }
}
