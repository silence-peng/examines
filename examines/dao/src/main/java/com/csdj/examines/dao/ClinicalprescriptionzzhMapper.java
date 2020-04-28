package com.csdj.examines.dao;

import com.csdj.examines.pojo.Clinicalbilling;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("linckaidan")
public interface ClinicalprescriptionzzhMapper {
    Clinicalbilling getnvClincal(@Param("userid") Integer userid, @Param("sex") Integer sex);
    int updateClincal(Clinicalbilling clinicalbilling);
    int addClincale(Clinicalbilling clinicalbilling);
    Clinicalbilling getClinacle(@Param("userid") Integer userid, @Param("sex") Integer sex);
}
