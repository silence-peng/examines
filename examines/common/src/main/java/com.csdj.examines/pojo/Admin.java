package com.csdj.examines.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adminid;
    private String doctorname;
    private String doctorpassword;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", doctorname='" + doctorname + '\'' +
                ", doctorpassword='" + doctorpassword + '\'' +
                '}';
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
