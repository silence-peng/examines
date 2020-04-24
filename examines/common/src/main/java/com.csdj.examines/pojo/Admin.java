package com.csdj.examines.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adminId;
    private String doctorName;
    private String doctorPassword;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                '}';
    }

    public Admin() {
    }

    public Admin(Integer adminId, String doctorName, String doctorPassword) {
        this.adminId = adminId;
        this.doctorName = doctorName;
        this.doctorPassword = doctorPassword;
    }
}
