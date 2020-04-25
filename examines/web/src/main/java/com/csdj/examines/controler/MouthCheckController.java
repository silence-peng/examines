package com.csdj.examines.controler;

import com.csdj.examines.pojo.Oralcavity;
import com.csdj.examines.pojo.Xexamine;
import com.csdj.examines.service.MouthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MR.peng
 * @createDate: 2020/4/25
 * @description: X射线检查控制层
 */
@RestController
@RequestMapping("/check")
public class MouthCheckController {
    @Autowired
    private MouthCheckService service;

    /**
     * 判断账户用户是否进行了X射线检查
     * @param userid 对应账户id
     * @param sex 对应账户夫妻中一方的性别 默认男1 女0
     * @return  检查结果
     */
    @RequestMapping("mouthIsCheck")
    public Object isCheck(Integer userid,Integer sex){
        return service.IsCheckX(userid, sex);
    }

    /**
     * 执行X检查
     * @param oralcavity 传入参数
     * @return 结果行数
     */
    @RequestMapping("mouthCheck")
    public Integer check(@RequestBody Oralcavity oralcavity){
        return service.check(oralcavity);
    }
}
