package com.csdj.examines.dao;

import com.csdj.examines.pojo.Xexamine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: MR.peng
 * @createDate: 2020/4/25
 * @description: X射线检查数据模型层
 */

@Mapper
@Repository("xcheckMapper")
public interface XcheckMapper extends tk.mybatis.mapper.common.Mapper<Xexamine> {
    @Select("select * from xexamine where userid=#{userid} and sex=#{sex}")
    Xexamine isCheck(@Param("userid")Integer userid,@Param("sex")Integer sex);
}
