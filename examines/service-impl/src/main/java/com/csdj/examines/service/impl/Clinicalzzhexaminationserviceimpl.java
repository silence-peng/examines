package com.csdj.examines.service.impl;

import com.csdj.examines.dao.ClinicalzzhexaminationMapper;
import com.csdj.examines.pojo.Abo;
import com.csdj.examines.pojo.Clinicalexamination;
import com.csdj.examines.service.Clinicalzzhexaminationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Clinicalzzhexaminationserviceimpl implements Clinicalzzhexaminationservice {
    @Autowired
    private ClinicalzzhexaminationMapper mapper;

    public Clinicalexamination getClinical(Integer userid,Integer sex) {
        return mapper.getClinical(userid,sex);
    }

    public List<Abo> getabo() {
        return mapper.getabo();
    }

    public int updateClincale(Clinicalexamination clinicalexamination) {
        return mapper.updateClincale(clinicalexamination);
    }
    public int addClinicale(Clinicalexamination clinicalexamination) {
        return mapper.addClinicale(clinicalexamination);
    }

    public Clinicalexamination getClinacle(Integer userid,Integer sex) {
        return mapper.getClinacle(userid,sex);
    }
}
