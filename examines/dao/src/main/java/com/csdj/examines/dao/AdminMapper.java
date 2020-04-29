package com.csdj.examines.dao;

import com.csdj.examines.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("adminMapper")
public interface AdminMapper extends tk.mybatis.mapper.common.Mapper<Admin> {
}
