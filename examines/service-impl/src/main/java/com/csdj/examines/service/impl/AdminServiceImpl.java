package com.csdj.examines.service.impl;

import com.csdj.examines.dao.AdminMapper;
import com.csdj.examines.pojo.Admin;
import com.csdj.examines.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    public Admin checkLogin(Admin admin) {
        List<Admin> list=adminMapper.select(admin);

        return list.get(0);
    }
}
