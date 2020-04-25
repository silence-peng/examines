package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HealthCheckUp {
    private Integer healthId;
    private Integer userId;
    private Integer sex;
    private Integer height;
    private Float BMI;
    private Float weight;
    private Integer smmHg;
    private Integer mmHgs;
    private Integer P;
    private Integer  isSpirit;
    private String spiritContent;
    private Integer isTheFive;
    private String theFiveContent;
    private Integer isPosture;
    private String postureContent;
    private Integer isFace;
    private String faceContent;
    private Integer isHair;
    private String hairContent;
    private Integer isThyroid;
    private String thyroidContent;
    private String doctorName;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date examineDate;

    public HealthCheckUp() {
    }

    public HealthCheckUp(Integer healthId, Integer userId, Integer sex, Integer height, Float BMI, Float weight, Integer smmHg, Integer mmHgs, Integer p, Integer isSpirit, String spiritContent, Integer isTheFive, String theFiveContent, Integer isPosture, String postureContent, Integer isFace, String faceContent, Integer isHair, String hairContent, Integer isThyroid, String thyroidContent, String doctorName, Date examineDate) {
        this.healthId = healthId;
        this.userId = userId;
        this.sex = sex;
        this.height = height;
        this.BMI = BMI;
        this.weight = weight;
        this.smmHg = smmHg;
        this.mmHgs = mmHgs;
        P = p;
        this.isSpirit = isSpirit;
        this.spiritContent = spiritContent;
        this.isTheFive = isTheFive;
        this.theFiveContent = theFiveContent;
        this.isPosture = isPosture;
        this.postureContent = postureContent;
        this.isFace = isFace;
        this.faceContent = faceContent;
        this.isHair = isHair;
        this.hairContent = hairContent;
        this.isThyroid = isThyroid;
        this.thyroidContent = thyroidContent;
        this.doctorName = doctorName;
        this.examineDate = examineDate;
    }

    @Override
    public String toString() {
        return "HealthCheckUp{" +
                "healthId=" + healthId +
                ", userId=" + userId +
                ", sex=" + sex +
                ", height=" + height +
                ", BMI=" + BMI +
                ", weight=" + weight +
                ", smmHg=" + smmHg +
                ", mmHgs=" + mmHgs +
                ", P=" + P +
                ", isSpirit=" + isSpirit +
                ", spiritContent='" + spiritContent + '\'' +
                ", isTheFive=" + isTheFive +
                ", theFiveContent='" + theFiveContent + '\'' +
                ", isPosture=" + isPosture +
                ", postureContent='" + postureContent + '\'' +
                ", isFace=" + isFace +
                ", faceContent='" + faceContent + '\'' +
                ", isHair=" + isHair +
                ", hairContent='" + hairContent + '\'' +
                ", isThyroid=" + isThyroid +
                ", thyroidContent='" + thyroidContent + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                '}';
    }

    public Integer getHealthId() {
        return healthId;
    }

    public void setHealthId(Integer healthId) {
        this.healthId = healthId;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Float getBMI() {
        return BMI;
    }

    public void setBMI(Float BMI) {
        this.BMI = BMI;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getSmmHg() {
        return smmHg;
    }

    public void setSmmHg(Integer smmHg) {
        this.smmHg = smmHg;
    }

    public Integer getMmHgs() {
        return mmHgs;
    }

    public void setMmHgs(Integer mmHgs) {
        this.mmHgs = mmHgs;
    }

    public Integer getP() {
        return P;
    }

    public void setP(Integer p) {
        P = p;
    }

    public Integer getIsSpirit() {
        return isSpirit;
    }

    public void setIsSpirit(Integer isSpirit) {
        this.isSpirit = isSpirit;
    }

    public String getSpiritContent() {
        return spiritContent;
    }

    public void setSpiritContent(String spiritContent) {
        this.spiritContent = spiritContent;
    }

    public Integer getIsTheFive() {
        return isTheFive;
    }

    public void setIsTheFive(Integer isTheFive) {
        this.isTheFive = isTheFive;
    }

    public String getTheFiveContent() {
        return theFiveContent;
    }

    public void setTheFiveContent(String theFiveContent) {
        this.theFiveContent = theFiveContent;
    }

    public Integer getIsPosture() {
        return isPosture;
    }

    public void setIsPosture(Integer isPosture) {
        this.isPosture = isPosture;
    }

    public String getPostureContent() {
        return postureContent;
    }

    public void setPostureContent(String postureContent) {
        this.postureContent = postureContent;
    }

    public Integer getIsFace() {
        return isFace;
    }

    public void setIsFace(Integer isFace) {
        this.isFace = isFace;
    }

    public String getFaceContent() {
        return faceContent;
    }

    public void setFaceContent(String faceContent) {
        this.faceContent = faceContent;
    }

    public Integer getIsHair() {
        return isHair;
    }

    public void setIsHair(Integer isHair) {
        this.isHair = isHair;
    }

    public String getHairContent() {
        return hairContent;
    }

    public void setHairContent(String hairContent) {
        this.hairContent = hairContent;
    }

    public Integer getIsThyroid() {
        return isThyroid;
    }

    public void setIsThyroid(Integer isThyroid) {
        this.isThyroid = isThyroid;
    }

    public String getThyroidContent() {
        return thyroidContent;
    }

    public void setThyroidContent(String thyroidContent) {
        this.thyroidContent = thyroidContent;
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
}
