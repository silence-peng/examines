package com.csdj.examines.dao;

import com.csdj.examines.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 基本档案信息查询
 */
@Mapper
@Repository("GeneralMapper")
public interface GeneralMapper {
    /**
     * 查询基本信息
     * @param userid 用户id
     * @param creatDateone 建档开始时间
     * @param creatDatetwo 建档结束时间
     * @param mname  妻子姓名
     * @param mcard  妻子证件号
     * @param fname  丈夫姓名
     * @param fcard  丈夫证件号
     * @param result  B超状态
     * @param index   分页下标
     * @param pageSize 查询几条
     * @return 返回基本信息
     */

        List<Userinfo> getUserInfo(@Param("userid") Integer userid, @Param("creatDateone") String creatDateone, @Param("creatDatetwo") String creatDatetwo,
                                   @Param("mname") String mname, @Param("mcard") String mcard, @Param("fname") String fname,
                                   @Param("fcard") String fcard, @Param("result") String result, @Param("index") Integer index, @Param("pageSize") Integer pageSize);

    /**
     * 查询分页多少条
     * @return 个数
     */
        int getUserInfoCount(@Param("userid") Integer userid, @Param("creatDateone") String creatDateone, @Param("creatDatetwo") String creatDatetwo,
                             @Param("mname") String mname, @Param("mcard") String mcard, @Param("fname") String fname,
                             @Param("fcard") String fcard, @Param("result") String result);
}
