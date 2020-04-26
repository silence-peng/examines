package com.csdj.examines.service.impl;

import com.csdj.examines.dao.*;
import com.csdj.examines.pojo.*;
import com.csdj.examines.service.CommonCheckService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CommonCheckServiceImpl implements CommonCheckService {
    @Autowired
    private NowmedicalhistoryMapper nowmedicalhistoryMapper;
    @Autowired
    private MedicalhistoryMapper medicalhistoryMapper;
    @Autowired
    private MedicalhistorytypeMapper medicalhistorytypeMapper;
    @Autowired
    private NowmedicalhistorytypeMapper nowmedicalhistorytypeMapper;
    @Autowired
    private CgkzresultMapper cgkzresultMapper;
    @Autowired
    private MaritalhistoryMapper maritalhistoryMapper ;
    @Autowired
    private YxcheckresultMapper checkresultMapper ;
    @Autowired
    private AddUserMapper mapper ;
    public Cgkzresult isCommonCheck(Integer userid,Integer sex) {
        return cgkzresultMapper.getOne(userid, sex);
    }
    @Transactional
    public Integer checkCommon(Cgkzresult cgkzresult, Medicalhistory medicalhistory,Maritalhistory maritalhistory,
                               Nowmedicalhistory nowmedicalhistory,Integer[] nowmedicalhistorytype
                                ,Integer[] medicalhistorytype) {
        String str1= StringUtils.join(nowmedicalhistorytype, ",");
        String str2= StringUtils.join(medicalhistorytype, ",");
        nowmedicalhistory.setNtypelist(str1);
        medicalhistory.setTypelist(str2);
        Cgkzresult result=cgkzresultMapper.getOne(cgkzresult.getUserid(), cgkzresult.getSex());
        if (result!=null){
            cgkzresult.setCgid(result.getCgid());
            cgkzresult.setBirthid(result.getBirthid());
            medicalhistory.setMedicalid(cgkzresult.getMedicalid());
            nowmedicalhistory.setNmedicalid(cgkzresult.getNmedicalid());
            nowmedicalhistoryMapper.updateByPrimaryKey(nowmedicalhistory);
            medicalhistoryMapper.updateByPrimaryKey(medicalhistory);
            return cgkzresultMapper.updateByPrimaryKey(cgkzresult);
        }else {
            Yxcheckresult yxcheckresult=checkresultMapper.getOne(cgkzresult.getUserid(),cgkzresult.getSex());
            yxcheckresult.setIscgkz(1);
            checkresultMapper.updateByPrimaryKey(yxcheckresult);
            mapper.addMaritalhistory(maritalhistory);
            mapper.addMedicalhistory(medicalhistory);
            mapper.addNowmedicalhistory(nowmedicalhistory);
            cgkzresult.setMedicalid(medicalhistory.getMedicalid());
            cgkzresult.setNmedicalid(medicalhistory.getMedicalid());
            cgkzresult.setBirthid(maritalhistory.getBirthid());
            return cgkzresultMapper.insert(cgkzresult);
        }
    }

    public List<Nowmedicalhistorytype> getNowMedicalHistoryType() {
        return nowmedicalhistorytypeMapper.selectAll();
    }

    public List<Medicalhistorytype> getMedicalHistoryType() {
        return medicalhistorytypeMapper.selectAll();
    }

    public Nowmedicalhistory getNowMedicalHistory(Integer id) {
        Nowmedicalhistory nowmedicalhistory=new Nowmedicalhistory();
        nowmedicalhistory.setNmedicalid(id);
        return nowmedicalhistoryMapper.selectByPrimaryKey(nowmedicalhistory);
    }

    public Medicalhistory getMedicalHistory(Integer id) {
        Medicalhistory medicalhistory=new Medicalhistory();
        medicalhistory.setMedicalid(id);
        return medicalhistoryMapper.selectByPrimaryKey(medicalhistory);
    }

    public Maritalhistory getMaritalhistory(Integer id) {
        Maritalhistory maritalhistory=new Maritalhistory();
        maritalhistory.setBirthid(id);
        return maritalhistoryMapper.selectByPrimaryKey(maritalhistory);
    }
}
