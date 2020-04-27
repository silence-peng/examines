package com.csdj.examines.dao;

import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CheckProveMapper {
    String getAdviseArr(@Param("userid")Integer userid,@Param("sex")Integer sex);

    List<Userinfo> loadUserInfo(@Param("name")String name, @Param("startdate") Date startdate, @Param("enddate") Date enddate);

}
