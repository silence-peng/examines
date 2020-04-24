import java.util.Date;

public class Xexamine {
    private  Integer xId;
    private  Integer userId;
    private  Integer xNum;
    private  String opinion;
    private  Integer abnormalType;
    private  String abnormalContent;
    private  String doctorName;
    private Date examineDate;
    private  Integer sex;

    @Override
    public String toString() {
        return "Xexamine{" +
                "xId=" + xId +
                ", userId=" + userId +
                ", xNum=" + xNum +
                ", opinion='" + opinion + '\'' +
                ", abnormalType=" + abnormalType +
                ", abnormalContent='" + abnormalContent + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", examineDate=" + examineDate +
                ", sex=" + sex +
                '}';
    }

    public Integer getxId() {
        return xId;
    }

    public void setxId(Integer xId) {
        this.xId = xId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getxNum() {
        return xNum;
    }

    public void setxNum(Integer xNum) {
        this.xNum = xNum;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(Integer abnormalType) {
        this.abnormalType = abnormalType;
    }

    public String getAbnormalContent() {
        return abnormalContent;
    }

    public void setAbnormalContent(String abnormalContent) {
        this.abnormalContent = abnormalContent;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
