package com.csdj.examines.pojo;

public class Yxadvisecheckresult {
    private  Integer relationid;
    private  Integer resultid;
    private  String advisearr;

    @Override
    public String toString() {
        return "Yxadvisecheckresult{" +
                "relationid=" + relationid +
                ", resultid=" + resultid +
                ", advisearr='" + advisearr + '\'' +
                '}';
    }

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public String getAdvisearr() {
        return advisearr;
    }

    public void setAdvisearr(String advisearr) {
        this.advisearr = advisearr;
    }
}
