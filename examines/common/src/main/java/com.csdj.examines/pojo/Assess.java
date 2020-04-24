package com.csdj.examines.pojo;

import java.io.Serializable;
import java.util.Date;

public class Assess implements Serializable{
    private Integer assId;
    private Integer uerId;
    private String content;
    private Integer sdId;
    private String doctorName;
    private Date examineDate;

    public Integer getAssId() {
        return assId;
    }

    public void setAssId(Integer assId) {
        this.assId = assId;
    }

    public Integer getUerId() {
        return uerId;
    }

    public void setUerId(Integer uerId) {
        this.uerId = uerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public Assess() {
    }

    public Assess(Integer assId, Integer uerId, String content, Integer sdId, String doctorName, Date examineDate) {
        this.assId = assId;
        this.uerId = uerId;
        this.content = content;
        this.sdId = sdId;
        this.doctorName = doctorName;
        this.examineDate = examineDate;
    }

    @Override
    public String toString() {
        return "Assess{" +
                "assId=" + assId +
                ", uerId=" + uerId +
                ", content='" + content + '\'' +
                ", sdId=" + sdId +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                '}';
    }
}
