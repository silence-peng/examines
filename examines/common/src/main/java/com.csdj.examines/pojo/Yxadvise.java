package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Yxadvise {
    @Id
    private  Integer yxid;
    private  String yxitem;

    public Integer getYxid() {
        return yxid;
    }

    public void setYxid(Integer yxid) {
        this.yxid = yxid;
    }

    public String getYxitem() {
        return yxitem;
    }

    @Override
    public String toString() {
        return "Yxadvise{" +
                "yxid=" + yxid +
                ", yxitem='" + yxitem + '\'' +
                '}';
    }

    public void setYxitem(String yxitem) {
        this.yxitem = yxitem;
    }
}
