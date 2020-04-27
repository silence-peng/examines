package com.csdj.examines.controler;

import com.csdj.examines.pojo.Abo;
import com.csdj.examines.pojo.Clinicalexamination;
import com.csdj.examines.pojo.Healthcheckup;
import com.csdj.examines.service.Clinicalzzhexaminationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Clincalzzh")
public class ClinicalzzhexaminationController {

    @Autowired
    private Clinicalzzhexaminationservice service;

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/get")
    @ResponseBody
    public Clinicalexamination get(HttpSession session, Integer sex){
        Integer userid= (Integer) session.getAttribute("userid");
        Clinicalexamination clinicalexamination=service.getClinical(userid,sex);
        return clinicalexamination;
    }

    @RequestMapping("/xlk")
    @ResponseBody
    public List<Abo> getc(){
       List<Abo> abo=service.getabo();
        return abo;
    }

    @RequestMapping("/updateClincale")
    @ResponseBody
    public String update(Clinicalexamination clinicalexamination,HttpSession session){
        Integer userid= (Integer) session.getAttribute("userid");
        clinicalexamination.setUserid(userid);
        int a=service.updateClincale(clinicalexamination);
        if(a>0){
            return  "a";
        }
        return  null;
    }

}
