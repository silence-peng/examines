package com.csdj.examines.service;

import com.csdj.examines.pojo.Clinicalbilling;
import org.apache.ibatis.annotations.Param;

public interface Clinicalprescriptionzzhservice {
    Clinicalbilling getnvClincal(Integer userid, Integer sex);
    int updateClincal(Clinicalbilling clinicalbilling);
}
