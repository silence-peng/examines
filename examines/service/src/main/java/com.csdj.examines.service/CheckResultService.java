package com.csdj.examines.service;

import com.csdj.examines.pojo.Yxadvisecheckresult;
import com.csdj.examines.pojo.Yxcheckresult;

public interface CheckResultService {
    Yxcheckresult getCheckResult(Integer userid,Integer sex);
    Yxadvisecheckresult getAdviceCheckResult(Integer id);
    Integer commitCheckResult(Yxcheckresult yxcheckresult,Integer [] advices);
}
