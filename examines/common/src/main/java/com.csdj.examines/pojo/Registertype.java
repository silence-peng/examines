public class Registertype {
    private  Integer regtypeId;
    private  String type;

    @Override
    public String toString() {
        return "Registertype{" +
                "regtypeId=" + regtypeId +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getRegtypeId() {
        return regtypeId;
    }

    public void setRegtypeId(Integer regtypeId) {
        this.regtypeId = regtypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
