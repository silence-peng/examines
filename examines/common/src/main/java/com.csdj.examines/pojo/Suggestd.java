package com.csdj.examines.pojo;

public class Suggestd {
    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Suggestd{" +
                "dId=" + dId +
                ", content='" + content + '\'' +
                '}';
    }

    private  Integer dId;
    private  String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
