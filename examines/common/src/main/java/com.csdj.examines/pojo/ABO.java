package com.csdj.examines.pojo;

import java.io.Serializable;

public class ABO implements Serializable {
    private Integer id;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ABO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    public ABO(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public ABO() {
    }
}
