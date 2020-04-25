package com.csdj.examines.dao;

import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 影像系统mapper接口
 */
@Mapper
public interface ImageMapper {
    /**
     * 查询用户影像
     * @param userinfo
     * @return List <Userinfo>
     */
    List<Userinfo> getUser(Userinfo userinfo);
}
