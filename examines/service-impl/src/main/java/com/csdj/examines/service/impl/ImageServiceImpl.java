package com.csdj.examines.service.impl;

import com.csdj.examines.dao.ImageMapper;
import com.csdj.examines.pojo.Userinfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author: ZhouZhengWu
 * @createDate: 2020/4/25
 * @description: 影像业务接口实现类
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    /**
     * 查询用户影像信息并分页
     * @param userinfo:查询条件
     * @param pageNum:当前页码
     * @param pageSize:页大小
     * @return PageHelper <Usrinfo>
     */
    public PageInfo<Userinfo> getUser(Userinfo userinfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Userinfo> list = imageMapper.getUser(userinfo);
        PageInfo<Userinfo> page = new PageInfo<Userinfo>(list);
        return page;
    }
}
