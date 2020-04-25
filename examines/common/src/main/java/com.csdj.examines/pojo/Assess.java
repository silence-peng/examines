package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Assess implements Serializable{
    private Integer assid;
    private Integer uerid;
    private String content;
    private Integer sdid;
    private String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;

    @Override
    public String toString() {
        return "Assess{" +
                "assid=" + assid +
                ", uerid=" + uerid +
                ", content='" + content + '\'' +
                ", sdid=" + sdid +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                '}';
    }

    public Integer getAssid() {
        return assid;
    }

    public void setAssid(Integer assid) {
        this.assid = assid;
    }

    public Integer getUerid() {
        return uerid;
    }

    public void setUerid(Integer uerid) {
        this.uerid = uerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
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
}
