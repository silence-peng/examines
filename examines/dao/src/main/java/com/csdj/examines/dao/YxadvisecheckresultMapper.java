package com.csdj.examines.dao;

import com.csdj.examines.pojo.Yxadvisecheckresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface YxadvisecheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxadvisecheckresult>{
    @Update("UPDATE yxadvisecheckresult SET adviseArr=#{arr} WHERE resultId=#{resultid}")
    int updateAdvicseResult(@Param("arr")String arr,@Param("resultid")Integer resultid);
    @Select("select * from  yxadvisecheckresult  WHERE resultId=#{resultid}")
    Yxadvisecheckresult getOne(Integer resultid);
}
