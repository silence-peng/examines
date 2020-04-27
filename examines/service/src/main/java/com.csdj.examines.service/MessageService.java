package com.csdj.examines.service;

import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public interface MessageService {
    List<Userinfo> loadUserInfo(String name, Date startdate,Date enddate);
    PageInfo<Userinfo> NoteByUserinfo(Userinfo userinfo,Integer page,Integer limit);
}
