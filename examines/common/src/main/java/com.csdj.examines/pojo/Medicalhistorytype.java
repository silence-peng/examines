package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Medicalhistorytype {
    @Id
    private Integer typeid;
    private String type;

    @Override
    public String toString() {
        return "Medicalhistorytype{" +
                "typeid=" + typeid +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
