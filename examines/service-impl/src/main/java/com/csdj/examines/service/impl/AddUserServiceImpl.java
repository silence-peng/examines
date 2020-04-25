package com.csdj.examines.service.impl;

import com.csdj.examines.dao.AddUserMapper;
import com.csdj.examines.pojo.Registertype;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 新增受检人员业务接口实现类
 */
@Service
public class AddUserServiceImpl implements AddUserService {
    @Autowired
    private AddUserMapper addUserMapper;

    /**
     * 新增受检人员
     * @param userinfo:新增对象
     * @return int
     */
    public int addUserInfo(Userinfo userinfo) {
        int result = addUserMapper.addUserInfo(userinfo);
        if (result>0){
            //新增受检人员后为其添加检查表
            addUserMapper.addYxResult(userinfo.getUserId(),0);
            return addUserMapper.addYxResult(userinfo.getUserId(),1);
        }
        return 0;
    }

    /**
     * 实现查询登记类型
     * @return List <Registertype>
     */
    public List<Registertype> getRegosterType() {
        return addUserMapper.getRegosterType();
    }
}
