package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Medicalhistory {
    private Integer medicalid;
    private String typelist;
    private String medicalname;
    private Integer morbiditycount;
    private Date latelytime;
    private Integer istakemedicine;
    private String capacity;
    private Integer isoperating;
    private String operatingroom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date operatingdate;

    @Override
    public String toString() {
        return "Medicalhistory{" +
                "medicalid=" + medicalid +
                ", typelist='" + typelist + '\'' +
                ", medicalname='" + medicalname + '\'' +
                ", morbiditycount=" + morbiditycount +
                ", latelytime=" + latelytime +
                ", istakemedicine=" + istakemedicine +
                ", capacity='" + capacity + '\'' +
                ", isoperating=" + isoperating +
                ", operatingroom='" + operatingroom + '\'' +
                ", operatingdate=" + operatingdate +
                '}';
    }

    public Integer getMedicalid() {
        return medicalid;
    }

    public void setMedicalid(Integer medicalid) {
        this.medicalid = medicalid;
    }

    public void setTypelist(String typelist) {
        this.typelist = typelist;
    }

    public void setMedicalname(String medicalname) {
        this.medicalname = medicalname;
    }

    public void setMorbiditycount(Integer morbiditycount) {
        this.morbiditycount = morbiditycount;
    }

    public void setLatelytime(Date latelytime) {
        this.latelytime = latelytime;
    }

    public void setIstakemedicine(Integer istakemedicine) {
        this.istakemedicine = istakemedicine;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setIsoperating(Integer isoperating) {
        this.isoperating = isoperating;
    }

    public void setOperatingroom(String operatingroom) {
        this.operatingroom = operatingroom;
    }

    public void setOperatingdate(Date operatingdate) {
        this.operatingdate = operatingdate;
    }

    public String getTypelist() {
        return typelist;
    }

    public String getMedicalname() {
        return medicalname;
    }

    public Integer getMorbiditycount() {
        return morbiditycount;
    }

    public Date getLatelytime() {
        return latelytime;
    }

    public Integer getIstakemedicine() {
        return istakemedicine;
    }

    public String getCapacity() {
        return capacity;
    }

    public Integer getIsoperating() {
        return isoperating;
    }

    public String getOperatingroom() {
        return operatingroom;
    }

    public Date getOperatingdate() {
        return operatingdate;
    }
}
