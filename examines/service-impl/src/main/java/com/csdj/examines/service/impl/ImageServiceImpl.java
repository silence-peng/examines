package com.csdj.examines.service.impl;

import com.csdj.examines.dao.BultrasoundMapper;
import com.csdj.examines.dao.ImageMapper;
import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Bultrasound;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.ImageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private BultrasoundMapper bultrasoundMapper;

    /**
     * 查询用户影像信息并分页
     * @param userinfo:查询条件
     * @param pageNum:当前页码
     * @param pageSize:页大小
     * @return PageHelper <Usrinfo>
     */
    public PageInfo<Userinfo> getUser(Integer pageNum, Integer pageSize,Userinfo userinfo) {
        PageHelper.startPage(pageNum,pageSize);
        List<Userinfo> list = imageMapper.getUser(userinfo);
        PageInfo<Userinfo> page = new PageInfo<Userinfo>(list);
        return page;
    }

    public Userinfo getUserOne(Integer userid) {
        return userinfoMapper.selectByPrimaryKey(userid);
    }

    public Bultrasound getBultrasoundOne(Integer userid) {
        Bultrasound bultrasound= new Bultrasound();
        bultrasound.setUserid(userid);
        return bultrasoundMapper.selectOne(bultrasound);
    }
    @Transactional
    public int deleteImg(Integer userid) {
        Bultrasound bultrasound= new Bultrasound();
        bultrasound.setUserid(userid);
        bultrasound.setBimgfile("");
        Example example = new Example(bultrasound.getClass());
        example.createCriteria().andEqualTo("userid",bultrasound.getUserid());
        return bultrasoundMapper.updateByExampleSelective(bultrasound,example);
    }
    @Transactional
    public int updB(Bultrasound bultrasound) {
        if (this.getBultrasoundOne(bultrasound.getUserid())!=null){
            return bultrasoundMapper.updateByPrimaryKey(bultrasound);
        }
        return bultrasoundMapper.insert(bultrasound);
    }
    @Transactional
    public int updateImg(Bultrasound bultrasound) {
        if (this.getBultrasoundOne(bultrasound.getUserid())==null){
            return bultrasoundMapper.insert(bultrasound);
        }
        Example example = new Example(bultrasound.getClass());
        example.createCriteria().andEqualTo("userid",bultrasound.getUserid());
        return bultrasoundMapper.updateByExampleSelective(bultrasound,example);
    }


}
