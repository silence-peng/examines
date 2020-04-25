package com.csdj.examines.dao;

import com.csdj.examines.pojo.Xexamine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: MR.peng
 * @createDate: 2020/4/25
 * @description: X射线检查数据模型层
 */

@Mapper
@Repository("xcheckMapper")
public interface XcheckMapper {
    /**
     * 判断账户用户是否进行了X射线检查
     * @param userId 对应账户id
     * @param sex 对应账户夫妻中一方的性别 默认男1 女0
     * @return  检查结果
     */
    Xexamine isCheck(@Param("userId")Integer userId,@Param("sex")Integer sex);

    /**
     * 进行X射线检查 执行新增操作
     * @param xexamine 传入参数
     * @return 结果行数
     */
    Integer checkX(Xexamine xexamine);
    /**
     * 进行X射线检查修改 执行修改操作
     * @param xexamine 传入参数
     * @return 结果行数
     */
    Integer updXCheck(Xexamine xexamine);
}
