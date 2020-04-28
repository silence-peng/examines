package com.csdj.examines.service.impl;

import com.csdj.examines.dao.CheckProveMapper;
import com.csdj.examines.dao.UserinfoMapper;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.service.MessageService;
import com.csdj.examines.util.HttpClientUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private UserinfoMapper mapper;
    @Autowired
    private CheckProveMapper checkProveMapper;
    public PageInfo<Userinfo> loadUserInfo(String name,Date startdate,Date enddate, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Userinfo>(checkProveMapper.loadUserInfo(name,startdate,enddate));
    }
    public Integer sendMessage(String phone,String text) throws IOException {
        HttpClientUtil client = HttpClientUtil.getInstance();

        //UTF发送
        int result = client.sendMsgUtf8("zjtest", "d41d8cd98f00b204e225",text,phone);
        if(result>0){
            System.out.println("UTF8成功发送条数=="+result);
        }else{
            System.out.println(client.getErrorMsg(result));
        }
        return result;
    }
    public PageInfo<Userinfo> NoteByUserinfo(Userinfo userinfo,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Userinfo> list = checkProveMapper.NoteByUserinfo(userinfo);
        PageInfo<Userinfo> page = new PageInfo<Userinfo>(list);
        return page;
    }
}
