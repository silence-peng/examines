package com.csdj.examines.service.impl;

import com.csdj.examines.dao.GeneralMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
/**
 * 基本信息service层实现
 */
public class GeneralServiceimpl   implements GeneralService {

    @Autowired
    private GeneralMapper mapper;
    /**
     *service层查询基础信息的接口实现
     */

    public List<Userinfo> getUserInfo(Integer  userid, String creatDateone, String creatDatetwo, String mname, String mcard, String fname, String fcard, String result, Integer index, Integer pageSize) {
        return mapper.getUserInfo(userid, creatDateone, creatDatetwo, mname, mcard, fname, fcard, result, (index-1)*pageSize,pageSize);
    }
    /**
     *service层查询分页总数的接口实现
     */
    public int getUserInfoCount(Integer userid, String creatDateone, String creatDatetwo, String mname, String mcard, String fname, String fcard, String result) {
        return mapper.getUserInfoCount(userid, creatDateone, creatDatetwo, mname, mcard, fname, fcard, result);
    }




}
