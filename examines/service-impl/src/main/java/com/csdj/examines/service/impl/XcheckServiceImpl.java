package com.csdj.examines.service.impl;

import com.csdj.examines.dao.XcheckMapper;
import com.csdj.examines.pojo.Xexamine;
import com.csdj.examines.service.XcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return xcheckMapper.isCheck(userId, sex);
    }
    public Integer check(Xexamine xexamine) {
        if (xcheckMapper.isCheck(xexamine.getUserId(), xexamine.getSex())!=null){
            return xcheckMapper.updXCheck(xexamine);
        }
        return xcheckMapper.checkX(xexamine);
    }
}
