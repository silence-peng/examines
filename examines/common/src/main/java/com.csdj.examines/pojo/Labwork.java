package com.csdj.examines.pojo;

public class Labwork {
    private Integer lobId;
    private Integer userId;
    private Integer sex;
    private String project;
    private Integer unit;
    private String scope;
    private Integer aisle;
    private String projectDetails;

    public Integer getLobId() {
        return lobId;
    }

    public void setLobId(Integer lobId) {
        this.lobId = lobId;
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

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public Labwork() {
    }

    public Labwork(Integer lobId, Integer userId, Integer sex, String project, Integer unit, String scope, Integer aisle, String projectDetails) {
        this.lobId = lobId;
        this.userId = userId;
        this.sex = sex;
        this.project = project;
        this.unit = unit;
        this.scope = scope;
        this.aisle = aisle;
        this.projectDetails = projectDetails;
    }

    @Override
    public String toString() {
        return "LabWork{" +
                "lobId=" + lobId +
                ", userId=" + userId +
                ", sex=" + sex +
                ", project='" + project + '\'' +
                ", unit=" + unit +
                ", scope='" + scope + '\'' +
                ", aisle=" + aisle +
                ", projectDetails='" + projectDetails + '\'' +
                '}';
    }
}
