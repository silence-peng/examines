package com.csdj.examines.service;

import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Yxadvise;
import com.csdj.examines.pojo.Yxcheckresult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 婚检证明业务接口
 */
public interface CheckProveService {
    Userinfo getUserByUserid(Integer userid);
    List<Yxadvise> getYxAdvise();
    Yxcheckresult getYxResultByUserid(Integer userid,Integer sex);
    String getAdviseArr(Integer userid,Integer sex);
    int save(String arr,Integer isabnormal, String abnormalities,Integer resultid);
}
