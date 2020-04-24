package com.csdj.examines.pojo;

import java.util.Date;

public class MedicalHistory {
    private Integer medicalId;
    private String typeList;
    private String medicalName;
    private Integer morbidityCount;
    private Date latelyTime;
    private Integer isTakeMedicine;
    private String capacity;
    private Integer isOperating;
    private String operatingRoom;
    private Date operatingDate;

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "medicalId=" + medicalId +
                ", typeList='" + typeList + '\'' +
                ", medicalName='" + medicalName + '\'' +
                ", morbidityCount=" + morbidityCount +
                ", latelyTime=" + latelyTime +
                ", isTakeMedicine=" + isTakeMedicine +
                ", capacity='" + capacity + '\'' +
                ", isOperating=" + isOperating +
                ", operatingRoom='" + operatingRoom + '\'' +
                ", operatingDate=" + operatingDate +
                '}';
    }

    public MedicalHistory() {
    }

    public MedicalHistory(Integer medicalId, String typeList, String medicalName, Integer morbidityCount, Date latelyTime, Integer isTakeMedicine, String capacity, Integer isOperating, String operatingRoom, Date operatingDate) {
        this.medicalId = medicalId;
        this.typeList = typeList;
        this.medicalName = medicalName;
        this.morbidityCount = morbidityCount;
        this.latelyTime = latelyTime;
        this.isTakeMedicine = isTakeMedicine;
        this.capacity = capacity;
        this.isOperating = isOperating;
        this.operatingRoom = operatingRoom;
        this.operatingDate = operatingDate;
    }

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    public Integer getMorbidityCount() {
        return morbidityCount;
    }

    public void setMorbidityCount(Integer morbidityCount) {
        this.morbidityCount = morbidityCount;
    }

    public Date getLatelyTime() {
        return latelyTime;
    }

    public void setLatelyTime(Date latelyTime) {
        this.latelyTime = latelyTime;
    }

    public Integer getIsTakeMedicine() {
        return isTakeMedicine;
    }

    public void setIsTakeMedicine(Integer isTakeMedicine) {
        this.isTakeMedicine = isTakeMedicine;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Integer getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(Integer isOperating) {
        this.isOperating = isOperating;
    }

    public String getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(String operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    public Date getOperatingDate() {
        return operatingDate;
    }

    public void setOperatingDate(Date operatingDate) {
        this.operatingDate = operatingDate;
    }
}
