package com.csdj.examines.pojo;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;

public class OralCavity {
    private  Integer oralId;

    private  Integer userId;
    private  String checkEquipment;
    private  String opinion;
    private  Integer abnormalType;
    private  String abnormalContent;
    private  String doctorName;
    private Date examineDate;
    private  Integer sex;

    @Override
    public String toString() {
        return "OralCavity{" +
                "oralId=" + oralId +
                ", userId=" + userId +
                ", checkEquipment='" + checkEquipment + '\'' +
                ", opinion='" + opinion + '\'' +
                ", abnormalType=" + abnormalType +
                ", abnormalContent='" + abnormalContent + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                ", sex=" + sex +
                '}';
    }

    public Integer getOralId() {
        return oralId;
    }

    public void setOralId(Integer oralId) {
        this.oralId = oralId;
    }

    public String getCheckEquipment() {
        return checkEquipment;
    }

    public void setCheckEquipment(String checkEquipment) {
        this.checkEquipment = checkEquipment;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
    }

    public String getAbnormalContent() {
        return abnormalContent;
    }

    public void setAbnormalContent(String abnormalContent) {
        this.abnormalContent = abnormalContent;
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
}
