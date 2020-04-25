package com.csdj.examines.pojo;

import org.omg.CORBA.INTERNAL;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BUltrasound implements Serializable {
    private Integer bId;
    private Integer userId;
    private String bImgfile;
    private String result;
    private String describe;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date examineDate;
    private String doctorName;
    private Integer imgSize;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getbImgfile() {
        return bImgfile;
    }

    public void setbImgfile(String bImgfile) {
        this.bImgfile = bImgfile;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getImgSize() {
        return imgSize;
    }

    public void setImgSize(Integer imgSize) {
        this.imgSize = imgSize;
    }

    public BUltrasound() {
    }

    public BUltrasound(Integer bId, Integer userId, String bImgfile, String result, String describe, Date examineDate, String doctorName, Integer imgSize) {
        this.bId = bId;
        this.userId = userId;
        this.bImgfile = bImgfile;
        this.result = result;
        this.describe = describe;
        this.examineDate = examineDate;
        this.doctorName = doctorName;
        this.imgSize = imgSize;
    }

    @Override
    public String toString() {
        return "BUltrasound{" +
                "bId=" + bId +
                ", userId=" + userId +
                ", bImgfile='" + bImgfile + '\'' +
                ", result='" + result + '\'' +
                ", describe='" + describe + '\'' +
                ", examineDate=" + examineDate +
                ", doctorName='" + doctorName + '\'' +
                ", imgSize=" + imgSize +
                '}';
    }
}
