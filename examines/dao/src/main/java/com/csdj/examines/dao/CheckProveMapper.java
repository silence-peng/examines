package com.csdj.examines.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckProveMapper {
    String getAdviseArr(@Param("userid")Integer userid,@Param("sex")Integer sex);
}
