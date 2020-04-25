package com.csdj.examines.dao;

import com.csdj.examines.pojo.Yxcheckresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("checkresultMapper")
public interface YxcheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxcheckresult> {
    @Select("select * from yxcheckresult where userid=#{userid} and sex=#{sex}")
    Yxcheckresult getOne(@Param("userid")Integer userid, @Param("sex")Integer sex);
}
