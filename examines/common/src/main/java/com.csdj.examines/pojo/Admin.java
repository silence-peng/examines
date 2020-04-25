package com.csdj.examines.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adminid;
    private String doctorname;
    private String doctorpassword;

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", doctorname='" + doctorname + '\'' +
                ", doctorpassword='" + doctorpassword + '\'' +
                '}';
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorpassword() {
        return doctorpassword;
    }

    public void setDoctorpassword(String doctorpassword) {
        this.doctorpassword = doctorpassword;
    }
}
