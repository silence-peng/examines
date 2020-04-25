package com.csdj.examines.service.impl;

import com.csdj.examines.dao.XcheckMapper;
import com.csdj.examines.pojo.Xexamine;
import com.csdj.examines.service.XcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Xexamine IsCheckX(Integer userId, Integer sex) {
        Xexamine xexamine=new Xexamine();
        xexamine.setUserId(userId);
        xexamine.setSex(sex);
        List<Xexamine> list=xcheckMapper.select(xexamine);
        if (list.size()==1){
            return list.get(0);
        }
        return null;
    }
    public Integer check(Xexamine xexamine) {
        if (xcheckMapper.selectOne(xexamine)!=null){
            return xcheckMapper.updateByPrimaryKey(xexamine);
        }
        return xcheckMapper.insertSelective(xexamine);
    }
}
