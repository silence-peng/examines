package com.csdj.examines.controler;

import com.csdj.examines.pojo.Clinicalbilling;
import com.csdj.examines.pojo.Clinicalexamination;
import com.csdj.examines.service.Clinicalprescriptionzzhservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("prescription")
public class ClinicalprescriptionzzhController {

    @Autowired
    private Clinicalprescriptionzzhservice servie;

    @RequestMapping("getscript")
    @ResponseBody
    public Clinicalbilling get(HttpSession session,Integer sex){
        Integer userid= (Integer) session.getAttribute("userid");
        Clinicalbilling clinicalbilling=servie.getnvClincal(userid,sex);
        return  clinicalbilling;
    }

    @RequestMapping("/updateClincale")
    @ResponseBody
    public String update(Clinicalbilling clinicalbilling, HttpSession session){
        Integer userid= (Integer) session.getAttribute("userid");
        clinicalbilling.setUserid(userid);
        int a=servie.updateClincal(clinicalbilling);
        if(a>0){
            return  "a";
        }
        return  null;
    }

    @RequestMapping("/addClin")
    @ResponseBody
    public String add(Clinicalbilling clinicalbilling,HttpSession session){
        Integer userid= (Integer) session.getAttribute("userid");
        clinicalbilling.setUserid(userid);
        int a=servie.addClincale(clinicalbilling);
        if(a>0){
            return  "a";
        }
        return  null;
    }

    @RequestMapping("/getclinacleNoOrYse")
    @ResponseBody
    public String getds(HttpSession session,Integer sex){
        Integer userid= (Integer) session.getAttribute("userid");
        Clinicalbilling clinacle=servie.getClinacle(userid,sex);
        if (clinacle==null){
            return "no";
        }
        return "yes";
    }
}
