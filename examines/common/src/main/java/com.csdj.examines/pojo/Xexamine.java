package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Xexamine {
    private  Integer xid;
    private  Integer userid;
    private  Integer xnum;
    private  String opinion;
    private  Integer abnormaltype;
    private  String abnormalcontent;
    private  String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;
    private  Integer sex;

    @Override
    public String toString() {
        return "Xexamine{" +
                "xid=" + xid +
                ", userid=" + userid +
                ", xnum=" + xnum +
                ", opinion='" + opinion + '\'' +
                ", abnormaltype=" + abnormaltype +
                ", abnormalcontent='" + abnormalcontent + '\'' +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                ", sex=" + sex +
                '}';
    }

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getXnum() {
        return xnum;
    }

    public void setXnum(Integer xnum) {
        this.xnum = xnum;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getAbnormaltype() {
        return abnormaltype;
    }

    public void setAbnormaltype(Integer abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    public String getAbnormalcontent() {
        return abnormalcontent;
    }

    public void setAbnormalcontent(String abnormalcontent) {
        this.abnormalcontent = abnormalcontent;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Date getExaminedate() {
        return examinedate;
    }

    public void setExaminedate(Date examinedate) {
        this.examinedate = examinedate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
