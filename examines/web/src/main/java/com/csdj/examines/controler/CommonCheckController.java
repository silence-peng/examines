package com.csdj.examines.controler;

import com.csdj.examines.pojo.Cgkzresult;
import com.csdj.examines.pojo.Maritalhistory;
import com.csdj.examines.pojo.Medicalhistory;
import com.csdj.examines.pojo.Nowmedicalhistory;
import com.csdj.examines.service.CommonCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/check")
public class CommonCheckController {
    @Autowired
    private CommonCheckService service;

    @RequestMapping("/isCommonCheck")
    public Object isCommonCheck(Integer userid,Integer sex){
        return service.isCommonCheck(userid,sex);
    }
    @RequestMapping("/getMaritalhistory")
    public Object getMaritalhistory(Integer id){
        return service.getMaritalhistory(id);
    }
    @RequestMapping("/getMedicalHistory")
    public Object getMedicalHistory(Integer id){
        return service.getMedicalHistory(id);
    }
    @RequestMapping("/getNowMedicalHistory")
    public Object getNowMedicalHistory(Integer id){
        return service.getNowMedicalHistory(id);
    }
    @RequestMapping("/commonCheck")
    public Object commonCheck(Cgkzresult cgkzresult, Medicalhistory medicalhistory,
                               Maritalhistory maritalhistory,  Nowmedicalhistory nowmedicalhistory,
                              Integer[] nowmedicalhistorytype,Integer[] medicalhistorytype){
        return service.checkCommon(cgkzresult,medicalhistory,maritalhistory,
                nowmedicalhistory,nowmedicalhistorytype,medicalhistorytype);
    }
    @RequestMapping("/loadMedicalhistorytype")
    public Object loadMedicalhistorytype(){
        return service.getMedicalHistoryType();
    }
    @RequestMapping("/loadNmedicalhistorytype")
    public Object loadNowMedicalhistorytype(){
        return service.getNowMedicalHistoryType();
    }
}
