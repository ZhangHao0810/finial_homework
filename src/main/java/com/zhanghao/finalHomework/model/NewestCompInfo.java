package com.zhanghao.finalHomework.model;

import java.util.Date;

/**
 * @author ZhangHao
 * @date 2019/12/27 14:07
 * @Description： 最新比赛信息的封装
 */
public class NewestCompInfo {

    private String compName;

    private  String leibie;

    private String xiangmu;

    private  String teacherName;

    private Date time;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public String getXiangmu() {
        return xiangmu;
    }

    public void setXiangmu(String xiangmu) {
        this.xiangmu = xiangmu;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
