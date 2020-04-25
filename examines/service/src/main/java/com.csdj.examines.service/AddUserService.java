package com.csdj.examines.service;

import com.csdj.examines.pojo.Registertype;
import com.csdj.examines.pojo.Userinfo;

import java.util.List;
/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 新增受检人员业务接口
 */
public interface AddUserService {
    /**
     * 新增受检人员
     * @param userinfo:新增对象
     * @return int
     */
    int addUserInfo(Userinfo userinfo);

    /**
     * 查询登记类型
     * @return List <Registertype>
     */
    List<Registertype> getRegosterType();
}
