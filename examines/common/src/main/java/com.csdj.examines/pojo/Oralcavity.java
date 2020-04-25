package com.csdj.examines.pojo;



import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.util.Date;

public class Oralcavity {
    @Id
    private  Integer oralid;
    private  Integer userid;
    private  String checkequipment;
    private  String opinion;
    private  Integer abnormaltype;
    private  String abnormalcontent;
    private  String doctorname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date examinedate;
    private  Integer sex;

    @Override
    public String toString() {
        return "Oralcavity{" +
                "oralid=" + oralid +
                ", userid=" + userid +
                ", checkequipment='" + checkequipment + '\'' +
                ", opinion='" + opinion + '\'' +
                ", abnormaltype=" + abnormaltype +
                ", abnormalcontent='" + abnormalcontent + '\'' +
                ", doctorname='" + doctorname + '\'' +
                ", examinedate=" + examinedate +
                ", sex=" + sex +
                '}';
    }

    public Integer getOralid() {
        return oralid;
    }

    public void setOralid(Integer oralid) {
        this.oralid = oralid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCheckequipment() {
        return checkequipment;
    }

    public void setCheckequipment(String checkequipment) {
        this.checkequipment = checkequipment;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getAbnormaltype() {
        return abnormaltype;
    }

    public void setAbnormaltype(Integer abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    public String getAbnormalcontent() {
        return abnormalcontent;
    }

    public void setAbnormalcontent(String abnormalcontent) {
        this.abnormalcontent = abnormalcontent;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Date getExaminedate() {
        return examinedate;
    }

    public void setExaminedate(Date examinedate) {
        this.examinedate = examinedate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
