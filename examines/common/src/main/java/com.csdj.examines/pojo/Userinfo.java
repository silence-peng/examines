package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Userinfo {
    private  Integer userId;
    private  String mName;
    private  String mCard;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private Date mBirthDate;
    private  String mPhone;
    private  String methnic;
    private  String mIdType;
    private  Integer mage;
    private  String mculture;
    private  String mjob;
    private  String mprovince;
    private  String mcity;
    private  String mcounty;
    private  String mdistrict;
    private  String mvillage;
    private  String mregistered;
    private  String fName;
    private  String fCard;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private  Date fBirthDate;
    private  String fPhone;
    private  String fethnic;
    private  String fIdType;
    private  Integer fage;
    private  String fculture;
    private  String fjob;
    private  String fprovince;
    private  String fcity;
    private  String fcounty;
    private  String fdistrict;
    private  String fvillage;
    private  String fregistered;
    private  String address;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private  Date creatDate;
    @DateTimeFormat(pattern="YYYY-MM-dd")
    private  Date getMarriedDate;
    private  Integer regtypeId;
    private  String landlineNumber;
    private  String mimg;

    @Override
    public String toString() {
        return "Userinfo{" +
                "userId=" + userId +
                ", mName='" + mName + '\'' +
                ", mCard='" + mCard + '\'' +
                ", mBirthDate=" + mBirthDate +
                ", mPhone='" + mPhone + '\'' +
                ", methnic='" + methnic + '\'' +
                ", mIdType='" + mIdType + '\'' +
                ", mage=" + mage +
                ", mculture='" + mculture + '\'' +
                ", mjob='" + mjob + '\'' +
                ", mprovince='" + mprovince + '\'' +
                ", mcity='" + mcity + '\'' +
                ", mcounty='" + mcounty + '\'' +
                ", mdistrict='" + mdistrict + '\'' +
                ", mvillage='" + mvillage + '\'' +
                ", mregistered='" + mregistered + '\'' +
                ", fName='" + fName + '\'' +
                ", fCard='" + fCard + '\'' +
                ", fBirthDate=" + fBirthDate +
                ", fPhone='" + fPhone + '\'' +
                ", fethnic='" + fethnic + '\'' +
                ", fIdType='" + fIdType + '\'' +
                ", fage=" + fage +
                ", fculture='" + fculture + '\'' +
                ", fjob='" + fjob + '\'' +
                ", fprovince='" + fprovince + '\'' +
                ", fcity='" + fcity + '\'' +
                ", fcounty='" + fcounty + '\'' +
                ", fdistrict='" + fdistrict + '\'' +
                ", fvillage='" + fvillage + '\'' +
                ", fregistered='" + fregistered + '\'' +
                ", address='" + address + '\'' +
                ", creatDate=" + creatDate +
                ", getMarriedDate=" + getMarriedDate +
                ", regtypeId=" + regtypeId +
                ", landlineNumber='" + landlineNumber + '\'' +
                ", mimg='" + mimg + '\'' +
                ", fimg='" + fimg + '\'' +
                ", email='" + email + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }

    private  String fimg;
    private  String email;
    private  String doctorName;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCard() {
        return mCard;
    }

    public void setmCard(String mCard) {
        this.mCard = mCard;
    }

    public Date getmBirthDate() {
        return mBirthDate;
    }

    public void setmBirthDate(Date mBirthDate) {
        this.mBirthDate = mBirthDate;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getMethnic() {
        return methnic;
    }

    public void setMethnic(String methnic) {
        this.methnic = methnic;
    }

    public String getmIdType() {
        return mIdType;
    }

    public void setmIdType(String mIdType) {
        this.mIdType = mIdType;
    }

    public Integer getMage() {
        return mage;
    }

    public void setMage(Integer mage) {
        this.mage = mage;
    }

    public String getMculture() {
        return mculture;
    }

    public void setMculture(String mculture) {
        this.mculture = mculture;
    }

    public String getMjob() {
        return mjob;
    }

    public void setMjob(String mjob) {
        this.mjob = mjob;
    }

    public String getMprovince() {
        return mprovince;
    }

    public void setMprovince(String mprovince) {
        this.mprovince = mprovince;
    }

    public String getMcity() {
        return mcity;
    }

    public void setMcity(String mcity) {
        this.mcity = mcity;
    }

    public String getMcounty() {
        return mcounty;
    }

    public void setMcounty(String mcounty) {
        this.mcounty = mcounty;
    }

    public String getMdistrict() {
        return mdistrict;
    }

    public void setMdistrict(String mdistrict) {
        this.mdistrict = mdistrict;
    }

    public String getMvillage() {
        return mvillage;
    }

    public void setMvillage(String mvillage) {
        this.mvillage = mvillage;
    }

    public String getMregistered() {
        return mregistered;
    }

    public void setMregistered(String mregistered) {
        this.mregistered = mregistered;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfCard() {
        return fCard;
    }

    public void setfCard(String fCard) {
        this.fCard = fCard;
    }

    public Date getfBirthDate() {
        return fBirthDate;
    }

    public void setfBirthDate(Date fBirthDate) {
        this.fBirthDate = fBirthDate;
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public String getFethnic() {
        return fethnic;
    }

    public void setFethnic(String fethnic) {
        this.fethnic = fethnic;
    }

    public String getfIdType() {
        return fIdType;
    }

    public void setfIdType(String fIdType) {
        this.fIdType = fIdType;
    }

    public Integer getFage() {
        return fage;
    }

    public void setFage(Integer fage) {
        this.fage = fage;
    }

    public String getFculture() {
        return fculture;
    }

    public void setFculture(String fculture) {
        this.fculture = fculture;
    }

    public String getFjob() {
        return fjob;
    }

    public void setFjob(String fjob) {
        this.fjob = fjob;
    }

    public String getFprovince() {
        return fprovince;
    }

    public void setFprovince(String fprovince) {
        this.fprovince = fprovince;
    }

    public String getFcity() {
        return fcity;
    }

    public void setFcity(String fcity) {
        this.fcity = fcity;
    }

    public String getFcounty() {
        return fcounty;
    }

    public void setFcounty(String fcounty) {
        this.fcounty = fcounty;
    }

    public String getFdistrict() {
        return fdistrict;
    }

    public void setFdistrict(String fdistrict) {
        this.fdistrict = fdistrict;
    }

    public String getFvillage() {
        return fvillage;
    }

    public void setFvillage(String fvillage) {
        this.fvillage = fvillage;
    }

    public String getFregistered() {
        return fregistered;
    }

    public void setFregistered(String fregistered) {
        this.fregistered = fregistered;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getGetMarriedDate() {
        return getMarriedDate;
    }

    public void setGetMarriedDate(Date getMarriedDate) {
        this.getMarriedDate = getMarriedDate;
    }

    public Integer getRegtypeId() {
        return regtypeId;
    }

    public void setRegtypeId(Integer regtypeId) {
        this.regtypeId = regtypeId;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg;
    }

    public String getFimg() {
        return fimg;
    }

    public void setFimg(String fimg) {
        this.fimg = fimg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }



}
