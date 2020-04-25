package com.csdj.examines.dao;

import com.csdj.examines.pojo.Yxadvisecheckresult;
import com.csdj.examines.pojo.Yxcheckresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface YxcheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxcheckresult> {
    @Select("SELECT * FROM yxcheckresult WHERE userid=#{userid} AND sex=#{sex}")
    Yxcheckresult getYxResultByUserid(@Param("userid")Integer userid, @Param("sex")Integer sex);
    @Update("UPDATE yxcheckresult SET isAbnormal=#{isabnormal} ,abnormalities=#{abnormalities} WHERE resultId=#{resultid}")
    int updateYxResultByUserid(@Param("isabnormal")Integer isabnormal, @Param("abnormalities")Integer abnormalities,@Param("resultid")Integer resultid);
}