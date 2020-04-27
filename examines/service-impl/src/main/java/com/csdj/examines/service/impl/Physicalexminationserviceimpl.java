package com.csdj.examines.service.impl;

import com.csdj.examines.dao.Physicalexaminationmapper;
import com.csdj.examines.pojo.Healthcheckup;
import com.csdj.examines.service.Physicalexminationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Physicalexminationserviceimpl implements Physicalexminationservice {
    @Autowired
    private Physicalexaminationmapper mapper;

    public Healthcheckup getHealthcheck(Integer userid, Integer sex) {
        return mapper.getHealthcheck(userid, sex);
    }
    @Transactional
    public int updateheal(Healthcheckup healthcheckup) {
        return mapper.updateheal(healthcheckup);
    }
}
