package com.csdj.examines.pojo;

public class NowMedicalHistoryType {
    private Integer ntypeId;
    private String ntype;

    public NowMedicalHistoryType() {
    }

    public NowMedicalHistoryType(Integer ntypeId, String ntype) {
        this.ntypeId = ntypeId;
        this.ntype = ntype;
    }

    @Override
    public String toString() {
        return "NowMedicalHistoryType{" +
                "ntypeId=" + ntypeId +
                ", ntype='" + ntype + '\'' +
                '}';
    }

    public Integer getNtypeId() {
        return ntypeId;
    }

    public void setNtypeId(Integer ntypeId) {
        this.ntypeId = ntypeId;
    }

    public String getNtype() {
        return ntype;
    }

    public void setNtype(String ntype) {
        this.ntype = ntype;
    }
}
