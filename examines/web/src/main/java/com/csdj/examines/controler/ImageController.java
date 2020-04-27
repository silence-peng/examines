package com.csdj.examines.controler;

import com.csdj.examines.pojo.Bultrasound;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.ImageService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
        PageInfo<Userinfo> pages = imageService.getUser(page,limit,userinfo);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pages.getTotal());
        map.put("data", pages.getList());
        return map;
    }
    @RequestMapping("tiao")
    public String tiao(Integer userid,HttpSession session){
        session.setAttribute("userid",userid);
        return "Bchao";
    }
    @RequestMapping("openImage")
    @ResponseBody
    public Userinfo openImage(HttpSession session){
        Integer userid = (Integer) session.getAttribute("userid");
        Userinfo userinfo = imageService.getUserOne(userid);
        return userinfo;
    }
    @RequestMapping("getB")
    @ResponseBody
    public Object getB(Integer userid){
        System.out.println(userid);
        Bultrasound bultrasound = imageService.getBultrasoundOne(userid);
        System.out.println(bultrasound);
        return bultrasound;
    }
    @RequestMapping("deleteImg")
    @ResponseBody
    public String deleteImg(Integer userid){
        int result = imageService.deleteImg(userid);
        if (result>0){
            return "ok";
        }
        return "no";
    }
    @RequestMapping("updB")
    @ResponseBody
    public Object updB(Bultrasound bultrasound){
        int result = imageService.updB(bultrasound);
        if (result>0){
            return "ok";
        }
        return "no";
    }
    @RequestMapping("updateImg")
    @ResponseBody
    public Object updateImg(MultipartFile file,Integer userid) throws IOException {
        Bultrasound bultrasound = new Bultrasound();
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        if (!file.isEmpty()){
            String path = System.getProperty("user.dir")+ "/web/src/main/resources/static/img/";
            String name=file.getOriginalFilename();
            String newFileName= UUID.randomUUID().toString();
            String suffix=name.substring(name.lastIndexOf("."));
            String newpath=path+"\\"+newFileName+suffix;
            Float size = Float.parseFloat(String.valueOf(file.getSize())) / 1024;
            BigDecimal b = new BigDecimal(size);
            // 2表示2位 ROUND_HALF_UP表明四舍五入
            size = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            if(suffix.equals(".png") || suffix.equals(".jpg") || suffix.equals(".jpeg")){
                File nfile = new File(newpath);
                file.transferTo(nfile);
                bultrasound.setBimgfile(newFileName+suffix);
                bultrasound.setImgsize(size);
                bultrasound.setUserid(userid);
                int result = imageService.updateImg(bultrasound);
                if (result>0) {
                    map2.put("src",newFileName+suffix);//图片url
                    map2.put("title",newFileName);//图片名称
                    map.put("code",0);//0表示成功，1失败
                    map.put("msg","上传成功");//提示消息
                    map.put("data",map2);
                    return map;
                }
            }
            map2.put("src",newFileName+suffix);//图片url
            map2.put("title",newFileName);//图片名称
            map.put("code",1);//0表示成功，1失败
            map.put("msg","上传失败");//提示消息
            map.put("data",map2);
            return map2;
        }
        return null;
    }
}
