package com.csdj.examines.service;

import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageInfo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface MessageService {
    Integer sendMessage(String phone,String text) throws IOException;
    PageInfo<Userinfo> loadUserInfo(String name,Date startdate,Date enddate, Integer page, Integer limit);
    PageInfo<Userinfo> NoteByUserinfo(Userinfo userinfo, Integer pageNum, Integer pageSize);
}
