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
        Xexamine xexamine=new Xexamine();
        xexamine.setUserid(userId);
        xexamine.setSex(sex);
        List<Xexamine> list=xcheckMapper.select(xexamine);
        if (list.size()==1){
            return list.get(0);
        }
        return null;
    }
    @Transactional
    public Integer check(Xexamine xexamine) {
        if (xcheckMapper.selectOne(xexamine)!=null){
            return xcheckMapper.updateByPrimaryKey(xexamine);
        }else {
            Yxcheckresult yxcheckresult=new Yxcheckresult();
            yxcheckresult.setUserid(xexamine.getUserid());
            yxcheckresult.setSex(xexamine.getSex());
            List<Yxcheckresult> list=checkresultMapper.select(yxcheckresult);
            if (list.size()==1){
                yxcheckresult=list.get(0);
            }
            yxcheckresult.setIsx(1);
            yxcheckresult.setSex(xexamine.getSex());
            checkresultMapper.updateByPrimaryKey(yxcheckresult);
            return xcheckMapper.insertSelective(xexamine);
        }

    }
}
