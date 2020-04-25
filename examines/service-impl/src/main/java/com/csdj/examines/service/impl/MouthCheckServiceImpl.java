package com.csdj.examines.service.impl;

import com.csdj.examines.dao.OralcavityMapper;
import com.csdj.examines.dao.YxcheckresultMapper;
import com.csdj.examines.pojo.Oralcavity;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.MouthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MouthCheckServiceImpl implements MouthCheckService {
    @Autowired
    private OralcavityMapper oralcavityMapper;
    @Autowired
    private YxcheckresultMapper checkresultMapper;
    public Oralcavity IsCheckX(Integer userId, Integer sex) {
        return oralcavityMapper.isCheck(userId, sex);
    }
    @Transactional
    public Integer check(Oralcavity oralcavity) {
        Oralcavity oralcavity1=oralcavityMapper.isCheck(oralcavity.getUserid(),oralcavity.getSex());
        if (oralcavity1!=null){
            oralcavity.setOralid(oralcavity1.getOralid());
            return oralcavityMapper.updateByPrimaryKey(oralcavity);
        }else {
            Yxcheckresult yxcheckresult=checkresultMapper.getOne(oralcavity.getUserid(), oralcavity.getSex());
            yxcheckresult.setIsoral(1);
            yxcheckresult.setSex(oralcavity.getSex());
            checkresultMapper.updateByPrimaryKeySelective(yxcheckresult);
            return oralcavityMapper.insertSelective(oralcavity);
        }
    }
}
