package com.csdj.examines.pojo;

import java.io.Serializable;
import java.util.Date;

public class CgkzResult implements Serializable {
    private Integer cgId;
    private Integer nmedicalId;
    private Integer medicalId;
    private Integer birthId;
    private String doctorName;
    private Date createDate;
    private Integer userId;
    private Integer sex;

    public Integer getCgId() {
        return cgId;
    }

    public void setCgId(Integer cgId) {
        this.cgId = cgId;
    }

    public Integer getNmedicalId() {
        return nmedicalId;
    }

    public void setNmedicalId(Integer nmedicalId) {
        this.nmedicalId = nmedicalId;
    }

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public Integer getBirthId() {
        return birthId;
    }

    public void setBirthId(Integer birthId) {
        this.birthId = birthId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public CgkzResult() {
    }

    public CgkzResult(Integer cgId, Integer nmedicalId, Integer medicalId, Integer birthId, String doctorName, Date createDate, Integer userId, Integer sex) {
        this.cgId = cgId;
        this.nmedicalId = nmedicalId;
        this.medicalId = medicalId;
        this.birthId = birthId;
        this.doctorName = doctorName;
        this.createDate = createDate;
        this.userId = userId;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "CgkzResult{" +
                "cgId=" + cgId +
                ", nmedicalId=" + nmedicalId +
                ", medicalId=" + medicalId +
                ", birthId=" + birthId +
                ", doctorName='" + doctorName + '\'' +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", sex=" + sex +
                '}';
    }
}
