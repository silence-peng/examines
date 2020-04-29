package com.csdj.examines.service.impl;

import com.csdj.examines.dao.AdminMapper;
import com.csdj.examines.pojo.Admin;
import com.csdj.examines.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    public Admin checkLogin(Admin admin) {
        return adminMapper.selectByPrimaryKey(admin);
    }
}
