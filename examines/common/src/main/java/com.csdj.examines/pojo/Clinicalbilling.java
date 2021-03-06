package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Clinicalbilling implements Serializable {
    @Id
    private Integer billid;
    private Integer userid;
    private String b;
    private String m;
    private String l;
    private String zcell;
    private String abo;
    private String rh;
    private String bloodsugar;
    private String hbsag;
    private String hbeab;
    private String hbsab;
    private String hbcab;
    private String hbeag;
    private String alt;
    private String cr;
    private String tsh;
    private String figg;
    private String tp;
    private String jigg;
    private String jigm;
    private String gigg;
    private String gigm;
    private String other;
    private String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;
    private Integer sex;

    @Override
    public String toString() {
        return "Clinicalbilling{" +
                "billid=" + billid +
                ", userid=" + userid +
                ", b='" + b + '\'' +
                ", m='" + m + '\'' +
                ", l='" + l + '\'' +
                ", zcell='" + zcell + '\'' +
                ", abo='" + abo + '\'' +
                ", rh='" + rh + '\'' +
                ", bloodsugar='" + bloodsugar + '\'' +
                ", hbsag='" + hbsag + '\'' +
                ", hbeab='" + hbeab + '\'' +
                ", hbsab='" + hbsab + '\'' +
                ", hbcab='" + hbcab + '\'' +
                ", hbeag='" + hbeag + '\'' +
                ", alt='" + alt + '\'' +
                ", cr='" + cr + '\'' +
                ", tsh='" + tsh + '\'' +
                ", figg='" + figg + '\'' +
                ", tp='" + tp + '\'' +
                ", jigg='" + jigg + '\'' +
                ", jigm='" + jigm + '\'' +
                ", gigg='" + gigg + '\'' +
                ", gigm='" + gigm + '\'' +
                ", other='" + other + '\'' +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                ", sex=" + sex +
                '}';
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getZcell() {
        return zcell;
    }

    public void setZcell(String zcell) {
        this.zcell = zcell;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getBloodsugar() {
        return bloodsugar;
    }

    public void setBloodsugar(String bloodsugar) {
        this.bloodsugar = bloodsugar;
    }

    public String getHbsag() {
        return hbsag;
    }

    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
    }

    public String getHbeab() {
        return hbeab;
    }

    public void setHbeab(String hbeab) {
        this.hbeab = hbeab;
    }

    public String getHbsab() {
        return hbsab;
    }

    public void setHbsab(String hbsab) {
        this.hbsab = hbsab;
    }

    public String getHbcab() {
        return hbcab;
    }

    public void setHbcab(String hbcab) {
        this.hbcab = hbcab;
    }

    public String getHbeag() {
        return hbeag;
    }

    public void setHbeag(String hbeag) {
        this.hbeag = hbeag;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getTsh() {
        return tsh;
    }

    public void setTsh(String tsh) {
        this.tsh = tsh;
    }

    public String getFigg() {
        return figg;
    }

    public void setFigg(String figg) {
        this.figg = figg;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getJigg() {
        return jigg;
    }

    public void setJigg(String jigg) {
        this.jigg = jigg;
    }

    public String getJigm() {
        return jigm;
    }

    public void setJigm(String jigm) {
        this.jigm = jigm;
    }

    public String getGigg() {
        return gigg;
    }

    public void setGigg(String gigg) {
        this.gigg = gigg;
    }

    public String getGigm() {
        return gigm;
    }

    public void setGigm(String gigm) {
        this.gigm = gigm;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
