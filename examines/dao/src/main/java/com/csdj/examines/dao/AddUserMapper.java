package com.csdj.examines.dao;

import com.csdj.examines.pojo.Registertype;
import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 新增人员信息的mapper接口
 */
@Mapper
public interface AddUserMapper {
    /**
     *新增人员方法
     * @param userinfo:Userinfo实体类
     * @return int类型
     */
    int addUserInfo(Userinfo userinfo);

    /**
     *查询登记类型
     * @return list <Registertype> 登记类型集合
     */
    List<Registertype> getRegosterType();

    /**
     * 新增人员检查表
     * @param userId:新增人员的id
     * @param sex:性别
     * @return int
     */
    int addYxResult(@Param("userId")Integer userId,@Param("sex")Integer sex);
}
