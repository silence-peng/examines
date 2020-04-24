package com.csdj.examines.pojo;

public class MaritalHistory {
    private Integer birthId;
    private Integer isDivorced;
    private Integer sonCount;
    private Integer girlCount;
    private Integer isGeneticDisease;
    private String geneticDisease;

    @Override
    public String toString() {
        return "MaritalHistory{" +
                "birthId=" + birthId +
                ", isDivorced=" + isDivorced +
                ", sonCount=" + sonCount +
                ", girlCount=" + girlCount +
                ", isGeneticDisease=" + isGeneticDisease +
                ", geneticDisease='" + geneticDisease + '\'' +
                '}';
    }

    public MaritalHistory() {
    }

    public MaritalHistory(Integer birthId, Integer isDivorced, Integer sonCount, Integer girlCount, Integer isGeneticDisease, String geneticDisease) {
        this.birthId = birthId;
        this.isDivorced = isDivorced;
        this.sonCount = sonCount;
        this.girlCount = girlCount;
        this.isGeneticDisease = isGeneticDisease;
        this.geneticDisease = geneticDisease;
    }

    public Integer getBirthId() {
        return birthId;
    }

    public void setBirthId(Integer birthId) {
        this.birthId = birthId;
    }

    public Integer getIsDivorced() {
        return isDivorced;
    }

    public void setIsDivorced(Integer isDivorced) {
        this.isDivorced = isDivorced;
    }

    public Integer getSonCount() {
        return sonCount;
    }

    public void setSonCount(Integer sonCount) {
        this.sonCount = sonCount;
    }

    public Integer getGirlCount() {
        return girlCount;
    }

    public void setGirlCount(Integer girlCount) {
        this.girlCount = girlCount;
    }

    public Integer getIsGeneticDisease() {
        return isGeneticDisease;
    }

    public void setIsGeneticDisease(Integer isGeneticDisease) {
        this.isGeneticDisease = isGeneticDisease;
    }

    public String getGeneticDisease() {
        return geneticDisease;
    }

    public void setGeneticDisease(String geneticDisease) {
        this.geneticDisease = geneticDisease;
    }
}
