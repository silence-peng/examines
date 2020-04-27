package com.csdj.examines.service.impl;

import com.csdj.examines.dao.ClinicalprescriptionzzhMapper;
import com.csdj.examines.pojo.Clinicalbilling;
import com.csdj.examines.service.Clinicalprescriptionzzhservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Clinicalprescriptionzzhserviceimpl implements Clinicalprescriptionzzhservice {

    @Autowired
    private ClinicalprescriptionzzhMapper mapper;

    public Clinicalbilling getnvClincal(Integer userid, Integer sex) {
        return mapper.getnvClincal(userid, sex);
    }

    public int updateClincal(Clinicalbilling clinicalbilling) {
        return mapper.updateClincal(clinicalbilling);
    }
}
