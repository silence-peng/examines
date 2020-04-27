package com.csdj.examines.service;

import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public interface MessageService {
    PageInfo<Userinfo> loadUserInfo(String name, Date startdate, Date enddate, Integer page, Integer limit);
}
