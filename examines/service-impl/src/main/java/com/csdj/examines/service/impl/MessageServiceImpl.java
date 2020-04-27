package com.csdj.examines.service.impl;

import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private UserinfoMapper mapper;
    public List<Userinfo> loadUserInfo(String name, Date startdate, Date enddate) {
        return mapper.loadUserInfo(name, startdate, enddate);
    }
}
