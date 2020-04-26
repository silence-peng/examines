package com.csdj.examines.dao;

import com.csdj.examines.pojo.Medicalhistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("medicalhistoryMapper")
public interface MedicalhistoryMapper extends tk.mybatis.mapper.common.Mapper<Medicalhistory> {
}
