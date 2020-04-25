package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Cgkzresult implements Serializable {
    @Id
    private Integer cgid;
    private Integer nmedicalid;
    private Integer medicalid;
    private Integer birthid;
    private String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private Integer userid;
    private Integer sex;

    @Override
    public String toString() {
        return "Cgkzresult{" +
                "cgid=" + cgid +
                ", nmedicalid=" + nmedicalid +
                ", medicalid=" + medicalid +
                ", birthid=" + birthid +
                ", doctorname='" + doctorname + '\'' +
                ", createdate=" + createdate +
                ", userid=" + userid +
                ", sex=" + sex +
                '}';
    }

    public Integer getCgid() {
        return cgid;
    }

    public void setCgid(Integer cgid) {
        this.cgid = cgid;
    }

    public Integer getNmedicalid() {
        return nmedicalid;
    }

    public void setNmedicalid(Integer nmedicalid) {
        this.nmedicalid = nmedicalid;
    }

    public Integer getMedicalid() {
        return medicalid;
    }

    public void setMedicalid(Integer medicalid) {
        this.medicalid = medicalid;
    }

    public Integer getBirthid() {
        return birthid;
    }

    public void setBirthid(Integer birthid) {
        this.birthid = birthid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
