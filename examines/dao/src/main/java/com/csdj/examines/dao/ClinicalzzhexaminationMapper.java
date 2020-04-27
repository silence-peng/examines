package com.csdj.examines.dao;

import com.csdj.examines.pojo.Abo;
import com.csdj.examines.pojo.Clinicalexamination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("Clincale")
public interface ClinicalzzhexaminationMapper {
     Clinicalexamination getClinical(@Param("userid") Integer userid, @Param("sex") Integer sex);
     List<Abo> getabo();
     int updateClincale(Clinicalexamination clinicalexamination);
}
