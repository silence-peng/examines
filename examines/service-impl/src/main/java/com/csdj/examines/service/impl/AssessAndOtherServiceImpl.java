package com.csdj.examines.service.impl;

import com.csdj.examines.dao.AssessMapper;
import com.csdj.examines.dao.SuggestMapper;
import com.csdj.examines.dao.SuggestdMapper;
import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Assess;
import com.csdj.examines.pojo.Suggest;
import com.csdj.examines.pojo.Suggestd;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.AssessAndOtherService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class AssessAndOtherServiceImpl implements AssessAndOtherService {
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private SuggestMapper suggestMapper;
    @Autowired
    private SuggestdMapper suggestdMapper;
    @Autowired
    private AssessMapper assessMapper;

    public Userinfo getUserOne(Integer userid) {
        Userinfo userinfo = new Userinfo();
        userinfo.setUserid(userid);
        return userinfoMapper.selectOne(userinfo);
    }

    public List<Suggest> getAllSuggest() {
        return suggestMapper.selectAll();
    }

    public List<Suggestd> getAllSuggestD() {
        return suggestdMapper.selectAll();
    }
    @Transactional
    public int addAssess(Assess assess) {
        Example example = new Example(assess.getClass());
        example.createCriteria().andEqualTo("userid",assess.getUserid());
        Assess ass = assessMapper.selectOneByExample(example);
        System.out.println(ass);
        if (ass!=null){
            ass.setContent(assess.getContent());
            ass.setSdid(assess.getSdid());
            ass.setDoctorname(assess.getDoctorname());
            ass.setExaminedate(assess.getExaminedate());
            return assessMapper.updateByPrimaryKey(ass);
        }else {
            return assessMapper.insert(assess);
        }
    }
}
