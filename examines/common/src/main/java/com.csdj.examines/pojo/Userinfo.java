package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Userinfo {
    private  Integer userid;
    private  String mname;
    private  String mcard;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mbirthdate;
    private  String mphone;
    private  String methnic;
    private  String midtype;
    private  Integer mage;
    private  String mculture;
    private  String mjob;
    private  String mprovince;
    private  String mcity;
    private  String mcounty;
    private  String mdistrict;
    private  String mvillage;
    private  String mregistered;
    private  String fname;
    private  String fcard;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date fbirthdate;
    private  String fphone;
    private  String fethnic;
    private  String fidtype;
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date creatdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date getmarrieddate;
    private  Integer regtypeid;
    private  String landlinenumber;
    private  String mimg;
    private String fimg;
    private String email;
    private String doctorname;

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", mname='" + mname + '\'' +
                ", mcard='" + mcard + '\'' +
                ", mbirthdate=" + mbirthdate +
                ", mphone='" + mphone + '\'' +
                ", methnic='" + methnic + '\'' +
                ", midtype='" + midtype + '\'' +
                ", mage=" + mage +
                ", mculture='" + mculture + '\'' +
                ", mjob='" + mjob + '\'' +
                ", mprovince='" + mprovince + '\'' +
                ", mcity='" + mcity + '\'' +
                ", mcounty='" + mcounty + '\'' +
                ", mdistrict='" + mdistrict + '\'' +
                ", mvillage='" + mvillage + '\'' +
                ", mregistered='" + mregistered + '\'' +
                ", fname='" + fname + '\'' +
                ", fcard='" + fcard + '\'' +
                ", fbirthdate=" + fbirthdate +
                ", fphone='" + fphone + '\'' +
                ", fethnic='" + fethnic + '\'' +
                ", fidtype='" + fidtype + '\'' +
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
                ", creatdate=" + creatdate +
                ", getmarrieddate=" + getmarrieddate +
                ", regtypeid=" + regtypeid +
                ", landlinenumber='" + landlinenumber + '\'' +
                ", mimg='" + mimg + '\'' +
                ", fimg='" + fimg + '\'' +
                ", email='" + email + '\'' +
                ", doctorname='" + doctorname + '\'' +
                '}';
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFimg() {
        return fimg;
    }

    public void setFimg(String fimg) {
        this.fimg = fimg;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcard() {
        return mcard;
    }

    public void setMcard(String mcard) {
        this.mcard = mcard;
    }

    public Date getMbirthdate() {
        return mbirthdate;
    }

    public void setMbirthdate(Date mbirthdate) {
        this.mbirthdate = mbirthdate;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMethnic() {
        return methnic;
    }

    public void setMethnic(String methnic) {
        this.methnic = methnic;
    }

    public String getMidtype() {
        return midtype;
    }

    public void setMidtype(String midtype) {
        this.midtype = midtype;
    }

    public Date getFbirthdate() {
        return fbirthdate;
    }

    public void setFbirthdate(Date fbirthdate) {
        this.fbirthdate = fbirthdate;
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFcard() {
        return fcard;
    }

    public void setFcard(String fcard) {
        this.fcard = fcard;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFethnic() {
        return fethnic;
    }

    public void setFethnic(String fethnic) {
        this.fethnic = fethnic;
    }

    public String getFidtype() {
        return fidtype;
    }

    public void setFidtype(String fidtype) {
        this.fidtype = fidtype;
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

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Date getGetmarrieddate() {
        return getmarrieddate;
    }

    public void setGetmarrieddate(Date getmarrieddate) {
        this.getmarrieddate = getmarrieddate;
    }

    public Integer getRegtypeid() {
        return regtypeid;
    }

    public void setRegtypeid(Integer regtypeid) {
        this.regtypeid = regtypeid;
    }

    public String getLandlinenumber() {
        return landlinenumber;
    }

    public void setLandlinenumber(String landlinenumber) {
        this.landlinenumber = landlinenumber;
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg;
    }
}
