package com.csdj.examines.dao;

import com.csdj.examines.pojo.Oralcavity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("oralcavityMapper")
public interface OralcavityMapper extends tk.mybatis.mapper.common.Mapper<Oralcavity> {
    @Select("select * from oralcavity where userid=#{userid} and sex=#{sex}")
    Oralcavity isCheck(@Param("userid")Integer userid, @Param("sex")Integer sex);
}
