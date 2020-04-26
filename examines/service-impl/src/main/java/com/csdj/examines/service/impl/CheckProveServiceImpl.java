package com.csdj.examines.service.impl;

import com.csdj.examines.dao.*;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Yxadvise;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckProveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 婚检证明业务接口实现类
 */
@Service
public class CheckProveServiceImpl implements CheckProveService {
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private YxcheckresultMapper yxcheckresultMapper;
    @Autowired
    private YxadviseMapper yxadviseMapper;
    @Autowired
    private YxadvisecheckresultMapper yxadvisecheckresultMapper;
    @Autowired
    private CheckProveMapper checkProveMapper;

    Example example = null;

    public Userinfo getUserByUserid(Integer userid) {
        Userinfo userinfo = new Userinfo();
        userinfo.setUserid(userid);
        return userinfoMapper.selectOne(userinfo);
    }

    public List<Yxadvise> getYxAdvise() {
        return yxadviseMapper.selectAll();
    }

    public Yxcheckresult getYxResultByUserid(Integer userid, Integer sex) {
        return yxcheckresultMapper.getYxResultByUserid(userid,sex);
    }

    public String getAdviseArr(Integer userid, Integer sex) {
        return checkProveMapper.getAdviseArr(userid,sex);
    }
    @Transactional
    public int save(String arr, Integer isabnormal, String abnormalities, Integer resultid) {
        yxcheckresultMapper.updateYxResultByUserid(isabnormal,abnormalities,resultid);
        return yxadvisecheckresultMapper.updateAdvicseResult(arr,resultid);
    }
}
