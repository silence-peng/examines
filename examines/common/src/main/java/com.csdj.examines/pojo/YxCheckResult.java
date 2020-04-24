package com.csdj.examines.pojo;

import java.util.Date;

public class YxCheckResult {
    private  Integer resultId;
    private  Integer userId;
    private  Integer sex;
    private  Integer isAbnormal;
    private String  abnormalities;
    private String  disease;
    private String  sanitation;
    private String  consult;
    private String  supplement;
    private String  advise;
    private String  adviseProject;
    private Integer  isAdvise;
    private String  ReferralHospital;
    private Date referralDate;
    private Date  forwardDate;
    private Date  proveDate;
    private String  doctorName;
    private Date  examineDate;
    private Integer  isOral;
    private Integer  isX;
    private Integer  isCgkz;
    private Integer  isOver;

    @Override
    public String toString() {
        return "YxCheckResult{" +
                "resultId=" + resultId +
                ", userId=" + userId +
                ", sex=" + sex +
                ", isAbnormal=" + isAbnormal +
                ", abnormalities='" + abnormalities + '\'' +
                ", disease='" + disease + '\'' +
                ", sanitation='" + sanitation + '\'' +
                ", consult='" + consult + '\'' +
                ", supplement='" + supplement + '\'' +
                ", advise='" + advise + '\'' +
                ", adviseProject='" + adviseProject + '\'' +
                ", isAdvise=" + isAdvise +
                ", ReferralHospital='" + ReferralHospital + '\'' +
                ", referralDate=" + referralDate +
                ", forwardDate=" + forwardDate +
                ", proveDate=" + proveDate +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                ", isOral=" + isOral +
                ", isX=" + isX +
                ", isCgkz=" + isCgkz +
                ", isOver=" + isOver +
                '}';
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
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

    public Integer getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(Integer isAbnormal) {
        this.isAbnormal = isAbnormal;
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

    public String getAdviseProject() {
        return adviseProject;
    }

    public void setAdviseProject(String adviseProject) {
        this.adviseProject = adviseProject;
    }

    public Integer getIsAdvise() {
        return isAdvise;
    }

    public void setIsAdvise(Integer isAdvise) {
        this.isAdvise = isAdvise;
    }

    public String getReferralHospital() {
        return ReferralHospital;
    }

    public void setReferralHospital(String referralHospital) {
        ReferralHospital = referralHospital;
    }

    public Date getReferralDate() {
        return referralDate;
    }

    public void setReferralDate(Date referralDate) {
        this.referralDate = referralDate;
    }

    public Date getForwardDate() {
        return forwardDate;
    }

    public void setForwardDate(Date forwardDate) {
        this.forwardDate = forwardDate;
    }

    public Date getProveDate() {
        return proveDate;
    }

    public void setProveDate(Date proveDate) {
        this.proveDate = proveDate;
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

    public Integer getIsOral() {
        return isOral;
    }

    public void setIsOral(Integer isOral) {
        this.isOral = isOral;
    }

    public Integer getIsX() {
        return isX;
    }

    public void setIsX(Integer isX) {
        this.isX = isX;
    }

    public Integer getIsCgkz() {
        return isCgkz;
    }

    public void setIsCgkz(Integer isCgkz) {
        this.isCgkz = isCgkz;
    }

    public Integer getIsOver() {
        return isOver;
    }

    public void setIsOver(Integer isOver) {
        this.isOver = isOver;
    }
}
