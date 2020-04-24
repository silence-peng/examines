package com.csdj.examines.pojo;

public class MedicalHistoryType {
    private Integer typeId;
    private String type;

    public MedicalHistoryType() {
    }

    public MedicalHistoryType(Integer typeId, String type) {
        this.typeId = typeId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "MedicalHistoryType{" +
                "typeId=" + typeId +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}