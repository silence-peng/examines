package com.csdj.examines.service.impl;

import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.dao.YxadviseMapper;
import com.csdj.examines.dao.YxadvisecheckresultMapper;
import com.csdj.examines.dao.YxcheckresultMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Yxadvise;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckProveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
