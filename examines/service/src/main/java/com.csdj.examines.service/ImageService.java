package com.csdj.examines.service;

import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageInfo;

import java.util.List;
/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 影像业务接口
 */
public interface ImageService {
    /**
     * 查询用户影像信息并分页
     * @param userinfo:查询条件
     * @param pageNum:当前页码
     * @param pageSize:页大小
     * @return PageHelper <Usrinfo>
     */
    PageInfo<Userinfo> getUser(Userinfo userinfo, Integer pageNum, Integer pageSize);
}
