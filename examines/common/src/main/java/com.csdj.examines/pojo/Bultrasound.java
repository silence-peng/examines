package com.csdj.examines.pojo;

import org.omg.CORBA.INTERNAL;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Bultrasound implements Serializable {
    @Id
    private Integer bid;
    private Integer userid;
    private String bimgfile;
    private String result;
    private String dev;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;
    private String bdoctorname;
    private Integer imgsize;

    @Override
    public String toString() {
        return "Bultrasound{" +
                "bid=" + bid +
                ", userid=" + userid +
                ", bimgfile='" + bimgfile + '\'' +
                ", result='" + result + '\'' +
                ", dev='" + dev + '\'' +
                ", examinedate=" + examinedate +
                ", bdoctorname='" + bdoctorname + '\'' +
                ", imgsize=" + imgsize +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBimgfile() {
        return bimgfile;
    }

    public void setBimgfile(String bimgfile) {
        this.bimgfile = bimgfile;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public Date getExaminedate() {
        return examinedate;
    }

    public void setExaminedate(Date examinedate) {
        this.examinedate = examinedate;
    }

    public String getBdoctorname() {
        return bdoctorname;
    }

    public void setBdoctorname(String doctorname) {
        this.bdoctorname = doctorname;
    }

    public Integer getImgsize() {
        return imgsize;
    }

    public void setImgsize(Integer imgsize) {
        this.imgsize = imgsize;
    }
}
