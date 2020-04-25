package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Suggest {
    @Id
    private  Integer id;

    @Override
    public String toString() {
        return "Suggest{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    private  String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
