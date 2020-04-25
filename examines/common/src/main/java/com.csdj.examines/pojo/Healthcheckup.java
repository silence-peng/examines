package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.util.Date;

public class Healthcheckup {
    @Id
    private Integer healthid;
    private Integer userid;
    private Integer sex;
    private Integer height;
    private Float bmi;
    private Float weight;
    private Integer smmhg;
    private Integer mmhgs;
    private Integer p;
    private Integer  isspirit;
    private String spiritcontent;
    private Integer isthefive;
    private String thefivecontent;
    private Integer isposture;
    private String posturecontent;
    private Integer isface;
    private String facecontent;
    private Integer ishair;
    private String haircontent;
    private Integer isthyroid;
    private String thyroidcontent;
    private String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;

    @Override
    public String toString() {
        return "Healthcheckup{" +
                "healthid=" + healthid +
                ", userid=" + userid +
                ", sex=" + sex +
                ", height=" + height +
                ", bmi=" + bmi +
                ", weight=" + weight +
                ", smmhg=" + smmhg +
                ", mmhgs=" + mmhgs +
                ", p=" + p +
                ", isspirit=" + isspirit +
                ", spiritcontent='" + spiritcontent + '\'' +
                ", isthefive=" + isthefive +
                ", thefivecontent='" + thefivecontent + '\'' +
                ", isposture=" + isposture +
                ", posturecontent='" + posturecontent + '\'' +
                ", isface=" + isface +
                ", facecontent='" + facecontent + '\'' +
                ", ishair=" + ishair +
                ", haircontent='" + haircontent + '\'' +
                ", isthyroid=" + isthyroid +
                ", thyroidcontent='" + thyroidcontent + '\'' +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                '}';
    }

    public Integer getHealthid() {
        return healthid;
    }

    public void setHealthid(Integer healthid) {
        this.healthid = healthid;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Float getBmi() {
        return bmi;
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getSmmhg() {
        return smmhg;
    }

    public void setSmmhg(Integer smmhg) {
        this.smmhg = smmhg;
    }

    public Integer getMmhgs() {
        return mmhgs;
    }

    public void setMmhgs(Integer mmhgs) {
        this.mmhgs = mmhgs;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Integer getIsspirit() {
        return isspirit;
    }

    public void setIsspirit(Integer isspirit) {
        this.isspirit = isspirit;
    }

    public String getSpiritcontent() {
        return spiritcontent;
    }

    public void setSpiritcontent(String spiritcontent) {
        this.spiritcontent = spiritcontent;
    }

    public Integer getIsthefive() {
        return isthefive;
    }

    public void setIsthefive(Integer isthefive) {
        this.isthefive = isthefive;
    }

    public String getThefivecontent() {
        return thefivecontent;
    }

    public void setThefivecontent(String thefivecontent) {
        this.thefivecontent = thefivecontent;
    }

    public Integer getIsposture() {
        return isposture;
    }

    public void setIsposture(Integer isposture) {
        this.isposture = isposture;
    }

    public String getPosturecontent() {
        return posturecontent;
    }

    public void setPosturecontent(String posturecontent) {
        this.posturecontent = posturecontent;
    }

    public Integer getIsface() {
        return isface;
    }

    public void setIsface(Integer isface) {
        this.isface = isface;
    }

    public String getFacecontent() {
        return facecontent;
    }

    public void setFacecontent(String facecontent) {
        this.facecontent = facecontent;
    }

    public Integer getIshair() {
        return ishair;
    }

    public void setIshair(Integer ishair) {
        this.ishair = ishair;
    }

    public String getHaircontent() {
        return haircontent;
    }

    public void setHaircontent(String haircontent) {
        this.haircontent = haircontent;
    }

    public Integer getIsthyroid() {
        return isthyroid;
    }

    public void setIsthyroid(Integer isthyroid) {
        this.isthyroid = isthyroid;
    }

    public String getThyroidcontent() {
        return thyroidcontent;
    }

    public void setThyroidcontent(String thyroidcontent) {
        this.thyroidcontent = thyroidcontent;
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
