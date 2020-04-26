package com.csdj.examines.controler;

import com.csdj.examines.pojo.Yxadvisecheckresult;
import com.csdj.examines.pojo.Yxcheckresult;
import com.csdj.examines.service.CheckProveService;
import com.csdj.examines.service.CheckResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check")
public class CheckResultConytoller {
    @Autowired
    private CheckResultService service;
    @RequestMapping("getCheckResult")
    public Object getCheckResult(Integer userid,Integer sex){
        return service.getCheckResult(userid, sex);
    }
    @RequestMapping("getAdviceCheckResult")
    public Object getAdviceCheckResult(Integer id) {
        return service.getAdviceCheckResult(id);
    }
    @RequestMapping("commitCheckResult")
    public Object commit(Yxcheckresult yxcheckresult,Integer [] advices){
        return service.commitCheckResult(yxcheckresult, advices);
    }

}
