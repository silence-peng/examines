package com.csdj.examines.pojo;

public class Nowmedicalhistory {
    private Integer nmedicalId;
    private String ntypeList;
    private String elseContent;

    public Nowmedicalhistory() {
    }

    public Nowmedicalhistory(Integer nmedicalId, String ntypeList, String elseContent) {
        this.nmedicalId = nmedicalId;
        this.ntypeList = ntypeList;
        this.elseContent = elseContent;
    }

    @Override
    public String toString() {
        return "NowMedicalHistory{" +
                "nmedicalId=" + nmedicalId +
                ", ntypeList='" + ntypeList + '\'' +
                ", elseContent='" + elseContent + '\'' +
                '}';
    }

    public Integer getNmedicalId() {
        return nmedicalId;
    }

    public void setNmedicalId(Integer nmedicalId) {
        this.nmedicalId = nmedicalId;
    }

    public String getNtypeList() {
        return ntypeList;
    }

    public void setNtypeList(String ntypeList) {
        this.ntypeList = ntypeList;
    }

    public String getElseContent() {
        return elseContent;
    }

    public void setElseContent(String elseContent) {
        this.elseContent = elseContent;
    }
}
