package com.csdj.examines.pojo;

public class Labwork {
    private Integer lobid;
    private Integer userid;
    private Integer sex;
    private String project;
    private Integer unit;
    private String scope;
    private Integer aisle;
    private String projectdetails;

    @Override
    public String toString() {
        return "Labwork{" +
                "lobid=" + lobid +
                ", userid=" + userid +
                ", sex=" + sex +
                ", project='" + project + '\'' +
                ", unit=" + unit +
                ", scope='" + scope + '\'' +
                ", aisle=" + aisle +
                ", projectdetails='" + projectdetails + '\'' +
                '}';
    }

    public Integer getLobid() {
        return lobid;
    }

    public void setLobid(Integer lobid) {
        this.lobid = lobid;
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Integer getAisle() {
        return aisle;
    }

    public void setAisle(Integer aisle) {
        this.aisle = aisle;
    }

    public String getProjectdetails() {
        return projectdetails;
    }

    public void setProjectdetails(String projectdetails) {
        this.projectdetails = projectdetails;
    }
}
