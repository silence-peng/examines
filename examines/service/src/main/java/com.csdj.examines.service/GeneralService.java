package com.csdj.examines.service;



import com.csdj.examines.pojo.Userinfo;

import java.util.List;

/**
 * service接口
 */
public interface GeneralService {
    /**
     * 查询基本信息service层接口
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
    List<Userinfo> getUserInfo(Integer userid, String creatDateone, String creatDatetwo,
                               String mname, String mcard, String fname,
                               String fcard, String result, Integer index, Integer pageSize);
    /**
     * 查询分页多少条的service接口
     * @return 总个数
     */
    int getUserInfoCount(Integer userid, String creatDateone, String creatDatetwo,
                         String mname, String mcard, String fname,
                         String fcard, String result);

}
