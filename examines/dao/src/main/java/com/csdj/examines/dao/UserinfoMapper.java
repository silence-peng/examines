package com.csdj.examines.dao;

import com.csdj.examines.pojo.Registertype;
import com.csdj.examines.pojo.Userinfo;
import com.csdj.examines.pojo.Xexamine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserinfoMapper extends tk.mybatis.mapper.common.Mapper<Userinfo>{
    @Select({
            "<script>",
            "SELECT u.userid,u.fname,u.fage,u.fbirthdate,a.content as address FROM userinfo u,assess a",
            "WHERE u.userid=a.userid",
            "<if test='name!=null and name!='' '>",
            "AND (u.fname like concat('%',#{name},'%') or u.mname like concat('%',#{name},'%'))",
            "</if>",
            "<if test='startDate!=null and startDate!='' and endDate!=null and endDate!='''>",
            "AND u.createdate between #{startDate} and #{endDate}",
            "</if>",
            "</script>"
    })
    List<Userinfo> loadUserInfo(@Param("name")String name,@Param("startdate") Date startdate,@Param("enddate") Date enddate);
}
