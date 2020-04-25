package com.csdj.examines.service.impl;

import com.csdj.examines.dao.XcheckMapper;
import com.csdj.examines.dao.YxcheckresultMapper;
import com.csdj.examines.pojo.Xexamine;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.XcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: MR.peng
 * @createDate: 2020/4/25
 * @description: X射线检查业务层实现
 */
@Service
public class XcheckServiceImpl implements XcheckService {
    @Autowired
    private XcheckMapper xcheckMapper;
    @Autowired
    private YxcheckresultMapper checkresultMapper;

    public Xexamine IsCheckX(Integer userId, Integer sex) {
        return xcheckMapper.isCheck(userId, sex);
    }
    @Transactional
    public Integer check(Xexamine xexamine) {
        Xexamine xexamine1=xcheckMapper.isCheck(xexamine.getUserid(),xexamine.getSex());
        if (xexamine1!=null){
            xexamine.setXid(xexamine1.getXid());
            return xcheckMapper.updateByPrimaryKey(xexamine);
        }else {
            Yxcheckresult yxcheckresult=checkresultMapper.getOne(xexamine.getUserid(), xexamine.getSex());
            yxcheckresult.setIsx(1);
            yxcheckresult.setSex(xexamine.getSex());
            checkresultMapper.updateByPrimaryKeySelective(yxcheckresult);
            return xcheckMapper.insertSelective(xexamine);
        }

    }
}
