package com.csdj.examines.service;

import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public interface MessageService {
    PageInfo<Userinfo> loadUserInfo(Userinfo userinfo, Integer page, Integer limit);
    PageInfo<Userinfo> NoteByUserinfo(Userinfo userinfo, Integer pageNum, Integer pageSize);
}
