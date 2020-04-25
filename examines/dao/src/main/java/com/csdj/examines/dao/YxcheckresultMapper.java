package com.csdj.examines.dao;

import com.csdj.examines.pojo.Yxcheckresult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("checkresultMapper")
public interface YxcheckresultMapper extends tk.mybatis.mapper.common.Mapper<Yxcheckresult> {
}
