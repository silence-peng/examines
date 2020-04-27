package com.csdj.examines.dao;

import com.csdj.examines.pojo.Healthcheckup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("Physicalexamination")
public interface Physicalexaminationmapper {
    /**
     *
     * @param userid 获取用户的id
     * @param sex    获取性别
     * @return  体格检查数据
     */
    Healthcheckup getHealthcheck(@Param("userid") Integer userid, @Param("sex") Integer sex);

    int updateheal(Healthcheckup healthcheckup);
}
