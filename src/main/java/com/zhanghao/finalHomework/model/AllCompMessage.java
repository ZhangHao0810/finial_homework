package com.zhanghao.finalHomework.model;

import java.math.BigDecimal;

/**
 * @author ZhangHao
 * @date 2019/12/27 18:10
 * @Description： 全部比赛信息
 */
public class AllCompMessage {

    private String compName;
    private String teacherName;
    private String leibie;
    private String xiangmu;
    private BigDecimal base;
    private BigDecimal factor;
    private String time;
    private Integer count;
    private Double fenshu;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getFenshu() {
        return fenshu;
    }

    public void setFenshu(Double fenshu) {
        this.fenshu = fenshu;
    }
}
