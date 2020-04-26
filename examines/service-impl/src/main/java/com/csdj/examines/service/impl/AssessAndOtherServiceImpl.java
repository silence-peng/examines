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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return assessMapper.insert(assess);
    }
}
