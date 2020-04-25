package com.csdj.examines.pojo;

import javax.persistence.Id;

public class Nowmedicalhistorytype {
    @Id
    private Integer ntypeid;
    private String ntype;

    @Override
    public String toString() {
        return "Nowmedicalhistorytype{" +
                "ntypeid=" + ntypeid +
                ", ntype='" + ntype + '\'' +
                '}';
    }

    public Integer getNtypeid() {
        return ntypeid;
    }

    public void setNtypeid(Integer ntypeid) {
        this.ntypeid = ntypeid;
    }

    public String getNtype() {
        return ntype;
    }

    public void setNtype(String ntype) {
        this.ntype = ntype;
    }
}
