package com.csdj.examines.pojo;

public class Registertype {
    private  Integer regtypeid;
    private  String type;

    @Override
    public String toString() {
        return "Registertype{" +
                "regtypeid=" + regtypeid +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getRegtypeid() {
        return regtypeid;
    }

    public void setRegtypeid(Integer regtypeid) {
        this.regtypeid = regtypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
