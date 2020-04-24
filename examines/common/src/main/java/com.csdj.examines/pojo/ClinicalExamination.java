package com.csdj.examines.pojo;

import java.io.Serializable;
import java.util.Date;

public class ClinicalExamination implements Serializable {
    private Integer cId;
    private Integer userId;
    private String pissexamine;
    private String abnormal;
    private Integer abotypeId;
    private String RH;
    private String bloodSugar;
    private String HBsAg;
    private String HBeAb;
    private String HBsAb;
    private String HBcAb;
    private String HBeAg;
    private String ALT;
    private String Cr;
    private String TSH;
    private String fIgG;
    private String TP;
    private String jIgG;
    private String jIgM;
    private String gIgG;
    private String gIgM;
    private String other;
    private String doctorName;
    private Date examineDate;
    private Integer sex;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPissexamine() {
        return pissexamine;
    }

    public void setPissexamine(String pissexamine) {
        this.pissexamine = pissexamine;
    }

    public String getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }

    public Integer getAbotypeId() {
        return abotypeId;
    }

    public void setAbotypeId(Integer abotypeId) {
        this.abotypeId = abotypeId;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public String getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getHBsAg() {
        return HBsAg;
    }

    public void setHBsAg(String HBsAg) {
        this.HBsAg = HBsAg;
    }

    public String getHBeAb() {
        return HBeAb;
    }

    public void setHBeAb(String HBeAb) {
        this.HBeAb = HBeAb;
    }

    public String getHBsAb() {
        return HBsAb;
    }

    public void setHBsAb(String HBsAb) {
        this.HBsAb = HBsAb;
    }

    public String getHBcAb() {
        return HBcAb;
    }

    public void setHBcAb(String HBcAb) {
        this.HBcAb = HBcAb;
    }

    public String getHBeAg() {
        return HBeAg;
    }

    public void setHBeAg(String HBeAg) {
        this.HBeAg = HBeAg;
    }

    public String getALT() {
        return ALT;
    }

    public void setALT(String ALT) {
        this.ALT = ALT;
    }

    public String getCr() {
        return Cr;
    }

    public void setCr(String cr) {
        Cr = cr;
    }

    public String getTSH() {
        return TSH;
    }

    public void setTSH(String TSH) {
        this.TSH = TSH;
    }

    public String getfIgG() {
        return fIgG;
    }

    public void setfIgG(String fIgG) {
        this.fIgG = fIgG;
    }

    public String getTP() {
        return TP;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }

    public String getjIgG() {
        return jIgG;
    }

    public void setjIgG(String jIgG) {
        this.jIgG = jIgG;
    }

    public String getjIgM() {
        return jIgM;
    }

    public void setjIgM(String jIgM) {
        this.jIgM = jIgM;
    }

    public String getgIgG() {
        return gIgG;
    }

    public void setgIgG(String gIgG) {
        this.gIgG = gIgG;
    }

    public String getgIgM() {
        return gIgM;
    }

    public void setgIgM(String gIgM) {
        this.gIgM = gIgM;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public ClinicalExamination() {
    }

    public ClinicalExamination(Integer cId, Integer userId, String pissexamine, String abnormal, Integer abotypeId, String RH, String bloodSugar, String HBsAg, String HBeAb, String HBsAb, String HBcAb, String HBeAg, String ALT, String cr, String TSH, String fIgG, String TP, String jIgG, String jIgM, String gIgG, String gIgM, String other, String doctorName, Date examineDate, Integer sex) {
        this.cId = cId;
        this.userId = userId;
        this.pissexamine = pissexamine;
        this.abnormal = abnormal;
        this.abotypeId = abotypeId;
        this.RH = RH;
        this.bloodSugar = bloodSugar;
        this.HBsAg = HBsAg;
        this.HBeAb = HBeAb;
        this.HBsAb = HBsAb;
        this.HBcAb = HBcAb;
        this.HBeAg = HBeAg;
        this.ALT = ALT;
        Cr = cr;
        this.TSH = TSH;
        this.fIgG = fIgG;
        this.TP = TP;
        this.jIgG = jIgG;
        this.jIgM = jIgM;
        this.gIgG = gIgG;
        this.gIgM = gIgM;
        this.other = other;
        this.doctorName = doctorName;
        this.examineDate = examineDate;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ClinicalExamination{" +
                "cId=" + cId +
                ", userId=" + userId +
                ", pissexamine='" + pissexamine + '\'' +
                ", abnormal='" + abnormal + '\'' +
                ", abotypeId=" + abotypeId +
                ", RH='" + RH + '\'' +
                ", bloodSugar='" + bloodSugar + '\'' +
                ", HBsAg='" + HBsAg + '\'' +
                ", HBeAb='" + HBeAb + '\'' +
                ", HBsAb='" + HBsAb + '\'' +
                ", HBcAb='" + HBcAb + '\'' +
                ", HBeAg='" + HBeAg + '\'' +
                ", ALT='" + ALT + '\'' +
                ", Cr='" + Cr + '\'' +
                ", TSH='" + TSH + '\'' +
                ", fIgG='" + fIgG + '\'' +
                ", TP='" + TP + '\'' +
                ", jIgG='" + jIgG + '\'' +
                ", jIgM='" + jIgM + '\'' +
                ", gIgG='" + gIgG + '\'' +
                ", gIgM='" + gIgM + '\'' +
                ", other='" + other + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                ", sex=" + sex +
                '}';
    }
}
