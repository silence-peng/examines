package com.csdj.examines.service.impl;

import com.csdj.examines.dao.YxadvisecheckresultMapper;
import com.csdj.examines.dao.YxcheckresultMapper;
import com.csdj.examines.pojo.Yxadvisecheckresult;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckResultService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckResultServiceImpl implements CheckResultService {
    @Autowired
    private YxcheckresultMapper checkresultMapper;
    @Autowired
    private YxadvisecheckresultMapper mapper;
    public Yxcheckresult getCheckResult(Integer userid, Integer sex) {
        return checkresultMapper.getOne(userid, sex);
    }

    public Yxadvisecheckresult getAdviceCheckResult(Integer id) {
        return mapper.getOne(id);
    }

    @Transactional
    public Integer commitCheckResult(Yxcheckresult yxcheckresult, Integer[] advices) {
        String str= StringUtils.join(advices, ",");
        Yxadvisecheckresult yxadvisecheckresult=mapper.getOne(yxcheckresult.getResultid());
        if (yxadvisecheckresult!=null){
            mapper.updateAdvicseResult(str,yxcheckresult.getResultid());
        }else{
            mapper.insert(yxadvisecheckresult);
        }
        yxcheckresult.setIsover(1);
        return checkresultMapper.updateByPrimaryKey(yxcheckresult);
    }
}
