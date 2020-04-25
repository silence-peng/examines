package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Nowmedicalhistory {
    @Id
    private Integer nmedicalid;
    private String ntypelist;
    private String elsecontent;

    @Override
    public String toString() {
        return "Nowmedicalhistory{" +
                "nmedicalid=" + nmedicalid +
                ", ntypelist='" + ntypelist + '\'' +
                ", elsecontent='" + elsecontent + '\'' +
                '}';
    }

    public Integer getNmedicalid() {
        return nmedicalid;
    }

    public void setNmedicalid(Integer nmedicalid) {
        this.nmedicalid = nmedicalid;
    }

    public String getNtypelist() {
        return ntypelist;
    }

    public void setNtypelist(String ntypelist) {
        this.ntypelist = ntypelist;
    }

    public String getElsecontent() {
        return elsecontent;
    }

    public void setElsecontent(String elsecontent) {
        this.elsecontent = elsecontent;
    }
}
