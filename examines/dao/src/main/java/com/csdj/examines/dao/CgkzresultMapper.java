package com.csdj.examines.dao;

import com.csdj.examines.pojo.Cgkzresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("cgkzresultMapper")
public interface CgkzresultMapper extends tk.mybatis.mapper.common.Mapper<Cgkzresult> {
    @Select("select * from cgkzresult where userid=#{userid} and sex=#{sex}")
    Cgkzresult  getOne(@Param("userid")Integer userid, @Param("sex")Integer sex);
}
