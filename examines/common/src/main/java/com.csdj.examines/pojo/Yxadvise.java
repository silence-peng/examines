public class Yxadvise {
    private  Integer yxId;
    private  String yxItem;

    @Override
    public String toString() {
        return "Yxadvise{" +
                "yxId=" + yxId +
                ", yxItem='" + yxItem + '\'' +
                '}';
    }

    public Integer getYxId() {
        return yxId;
    }

    public void setYxId(Integer yxId) {
        this.yxId = yxId;
    }

    public String getYxItem() {
        return yxItem;
    }

    public void setYxItem(String yxItem) {
        this.yxItem = yxItem;
    }
}
