package com.csdj.examines.dao;

import com.csdj.examines.pojo.Medicalhistorytype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("medicalhistorytypeMapper")
public interface MedicalhistorytypeMapper extends tk.mybatis.mapper.common.Mapper<Medicalhistorytype> {

}
