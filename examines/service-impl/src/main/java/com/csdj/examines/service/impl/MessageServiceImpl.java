package com.csdj.examines.service.impl;

import com.csdj.examines.dao.CheckProveMapper;
import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private UserinfoMapper mapper;
    @Autowired
    private CheckProveMapper checkProveMapper;
    public PageInfo<Userinfo> loadUserInfo(Userinfo userinfo, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Userinfo>(checkProveMapper.loadUserInfo(userinfo));
    }

    public PageInfo<Userinfo> NoteByUserinfo(Userinfo userinfo,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Userinfo> list = checkProveMapper.NoteByUserinfo(userinfo);
        PageInfo<Userinfo> page = new PageInfo<Userinfo>(list);
        return page;
    }
}
