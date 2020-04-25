package com.csdj.examines.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Yxcheckresult {
    private  Integer resultid;
    private  Integer userid;
    private  Integer sex;
    private  Integer isabnormal;
    private String  abnormalities;
    private String  disease;
    private String  sanitation;
    private String  consult;
    private String  supplement;
    private String  advise;
    private String  adviseproject;
    private Integer  isadvise;
    private String  referralhospital;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date referraldate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date  forwarddate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date  provedate;
    private String  doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date  examinedate;
    private Integer  isoral;
    private Integer  isx;
    private Integer  iscgkz;
    private Integer  isover;

    @Override
    public String toString() {
        return "Yxcheckresult{" +
                "resultid=" + resultid +
                ", userid=" + userid +
                ", sex=" + sex +
                ", isabnormal=" + isabnormal +
                ", abnormalities='" + abnormalities + '\'' +
                ", disease='" + disease + '\'' +
                ", sanitation='" + sanitation + '\'' +
                ", consult='" + consult + '\'' +
                ", supplement='" + supplement + '\'' +
                ", advise='" + advise + '\'' +
                ", adviseproject='" + adviseproject + '\'' +
                ", isadvise=" + isadvise +
                ", referralhospital='" + referralhospital + '\'' +
                ", referraldate=" + referraldate +
                ", forwarddate=" + forwarddate +
                ", provedate=" + provedate +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                ", isoral=" + isoral +
                ", isx=" + isx +
                ", iscgkz=" + iscgkz +
                ", isover=" + isover +
                '}';
    }

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
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

    public Integer getIsabnormal() {
        return isabnormal;
    }

    public void setIsabnormal(Integer isabnormal) {
        this.isabnormal = isabnormal;
    }

    public String getAbnormalities() {
        return abnormalities;
    }

    public void setAbnormalities(String abnormalities) {
        this.abnormalities = abnormalities;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSanitation() {
        return sanitation;
    }

    public void setSanitation(String sanitation) {
        this.sanitation = sanitation;
    }

    public String getConsult() {
        return consult;
    }

    public void setConsult(String consult) {
        this.consult = consult;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    public String getAdviseproject() {
        return adviseproject;
    }

    public void setAdviseproject(String adviseproject) {
        this.adviseproject = adviseproject;
    }

    public Integer getIsadvise() {
        return isadvise;
    }

    public void setIsadvise(Integer isadvise) {
        this.isadvise = isadvise;
    }

    public String getReferralhospital() {
        return referralhospital;
    }

    public void setReferralhospital(String referralhospital) {
        this.referralhospital = referralhospital;
    }

    public Date getReferraldate() {
        return referraldate;
    }

    public void setReferraldate(Date referraldate) {
        this.referraldate = referraldate;
    }

    public Date getForwarddate() {
        return forwarddate;
    }

    public void setForwarddate(Date forwarddate) {
        this.forwarddate = forwarddate;
    }

    public Date getProvedate() {
        return provedate;
    }

    public void setProvedate(Date provedate) {
        this.provedate = provedate;
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

    public Integer getIsoral() {
        return isoral;
    }

    public void setIsoral(Integer isoral) {
        this.isoral = isoral;
    }

    public Integer getIsx() {
        return isx;
    }

    public void setIsx(Integer isx) {
        this.isx = isx;
    }

    public Integer getIscgkz() {
        return iscgkz;
    }

    public void setIscgkz(Integer iscgkz) {
        this.iscgkz = iscgkz;
    }

    public Integer getIsover() {
        return isover;
    }

    public void setIsover(Integer isover) {
        this.isover = isover;
    }
}
