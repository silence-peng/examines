package com.csdj.examines.pojo;

public class Yxadvisecheckresult {
    private  Integer relationId;
    private  Integer resultId;
    private  String adviseArr;

    @Override
    public String toString() {
        return "YxAdviseCheckresult{" +
                "relationId=" + relationId +
                ", resultId=" + resultId +
                ", adviseArr='" + adviseArr + '\'' +
                '}';
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getAdviseArr() {
        return adviseArr;
    }

    public void setAdviseArr(String adviseArr) {
        this.adviseArr = adviseArr;
    }
}
