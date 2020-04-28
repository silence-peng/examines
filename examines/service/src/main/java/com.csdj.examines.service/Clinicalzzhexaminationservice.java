package com.csdj.examines.service;

import com.csdj.examines.pojo.Abo;
import com.csdj.examines.pojo.Clinicalexamination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Clinicalzzhexaminationservice {
    Clinicalexamination getClinical(Integer userid, Integer sex);
    List<Abo> getabo();
    int updateClincale(Clinicalexamination clinicalexamination);
    int addClinicale(Clinicalexamination clinicalexamination);
    Clinicalexamination getClinacle(Integer userid, Integer sex);
}
