package com.csdj.examines.dao;

<<<<<<< HEAD
import com.csdj.examines.pojo.Yxadvisecheckresult;
=======
>>>>>>> origin/master
import com.csdj.examines.pojo.Yxcheckresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Update;

@Mapper
public interface YxcheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxcheckresult> {
    @Select("SELECT * FROM yxcheckresult WHERE userid=#{userid} AND sex=#{sex}")
    Yxcheckresult getYxResultByUserid(@Param("userid")Integer userid, @Param("sex")Integer sex);
    @Update("UPDATE yxcheckresult SET isAbnormal=#{isabnormal} ,abnormalities=#{abnormalities} WHERE resultId=#{resultid}")
    int updateYxResultByUserid(@Param("isabnormal")Integer isabnormal, @Param("abnormalities")Integer abnormalities,@Param("resultid")Integer resultid);
=======
import org.springframework.stereotype.Repository;

@Mapper
@Repository("checkresultMapper")
public interface YxcheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxcheckresult> {
    @Select("select * from yxcheckresult where userid=#{userid} and sex=#{sex}")
    Yxcheckresult getOne(@Param("userid")Integer userid, @Param("sex")Integer sex);
>>>>>>> origin/master
}
