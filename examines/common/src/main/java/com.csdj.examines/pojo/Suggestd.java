package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Suggestd {

@Id
    private  Integer did;
    private  String content;

    @Override
    public String toString() {
        return "Suggestd{" +
                "did=" + did +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
