package com.csdj.examines.dao;

import com.csdj.examines.pojo.Maritalhistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("maritalhistoryMapper")
public interface MaritalhistoryMapper extends tk.mybatis.mapper.common.Mapper<Maritalhistory> {

}
