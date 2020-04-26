package com.csdj.examines.service;

import com.csdj.examines.pojo.*;

import java.util.List;

public interface CommonCheckService {
    Cgkzresult isCommonCheck(Integer userid,Integer sex);
    Integer checkCommon(Cgkzresult cgkzresult, Medicalhistory medicalhistory,Maritalhistory maritalhistory, Nowmedicalhistory nowmedicalhistory,List<Integer> nowmedicalhistorytype
            ,List<Integer> medicalhistorytype);
    List<Nowmedicalhistorytype> getNowMedicalHistoryType();
    List<Medicalhistorytype> getMedicalHistoryType();
}
