package com.csdj.examines.dao;

import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 新增人员信息的mapper接口
 */
@Mapper
public interface AddUserMapper {
    int addUserInfo(Userinfo userinfo);
    int addYxResult(@Param("userId")Integer userId,@Param("sex")Integer sex);
}
