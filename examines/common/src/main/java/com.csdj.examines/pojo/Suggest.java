package com.csdj.examines.pojo;

public class Suggest {
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
