package com.csdj.examines.pojo;

public class Maritalhistory {
    private Integer birthid;
    private Integer isdivorced;
    private Integer soncount;
    private Integer girlcount;
    private Integer isgeneticdisease;
    private String geneticdisease;

    @Override
    public String toString() {
        return "Maritalhistory{" +
                "birthid=" + birthid +
                ", isdivorced=" + isdivorced +
                ", soncount=" + soncount +
                ", girlcount=" + girlcount +
                ", isgeneticdisease=" + isgeneticdisease +
                ", geneticdisease='" + geneticdisease + '\'' +
                '}';
    }

    public Integer getBirthid() {
        return birthid;
    }

    public void setBirthid(Integer birthid) {
        this.birthid = birthid;
    }

    public Integer getIsdivorced() {
        return isdivorced;
    }

    public void setIsdivorced(Integer isdivorced) {
        this.isdivorced = isdivorced;
    }

    public Integer getSoncount() {
        return soncount;
    }

    public void setSoncount(Integer soncount) {
        this.soncount = soncount;
    }

    public Integer getGirlcount() {
        return girlcount;
    }

    public void setGirlcount(Integer girlcount) {
        this.girlcount = girlcount;
    }

    public Integer getIsgeneticdisease() {
        return isgeneticdisease;
    }

    public void setIsgeneticdisease(Integer isgeneticdisease) {
        this.isgeneticdisease = isgeneticdisease;
    }

    public String getGeneticdisease() {
        return geneticdisease;
    }

    public void setGeneticdisease(String geneticdisease) {
        this.geneticdisease = geneticdisease;
    }
}
