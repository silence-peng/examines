package com.csdj.examines.dao;

import com.csdj.examines.pojo.Nowmedicalhistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("nowmedicalhistoryMapper")
public interface NowmedicalhistoryMapper extends tk.mybatis.mapper.common.Mapper<Nowmedicalhistory> {
}
