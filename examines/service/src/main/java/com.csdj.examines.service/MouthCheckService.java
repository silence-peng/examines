package com.csdj.examines.service;


import com.csdj.examines.pojo.Oralcavity;

public interface MouthCheckService {
    /**
     * 判断账户用户是否进行了X射线检查
     * @param userId 对应账户id
     * @param sex 对应账户夫妻中一方的性别 默认男1 女0
     * @return  检查结果
     */
    Oralcavity IsCheckX(Integer userId, Integer sex);

    /**
     * 根据用户是否进行了X射线检查 来执行更新或新增操作
     * @param oralcavity 对应表的实体类
     * @return 结果行数
     */
    Integer check(Oralcavity oralcavity);

}
