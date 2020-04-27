package com.csdj.examines.service;

import com.csdj.examines.pojo.Healthcheckup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Physicalexminationservice {
    Healthcheckup getHealthcheck(Integer userid, Integer sex);
    int updateheal(Healthcheckup healthcheckup);
}
