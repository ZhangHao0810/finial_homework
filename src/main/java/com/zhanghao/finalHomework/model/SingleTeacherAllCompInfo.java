package com.zhanghao.finalHomework.model;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/26 12:25
 * @Description： 单个老师的全部比赛信息, 用作教师首页的展示
 */
public class SingleTeacherAllCompInfo {

    private String compName;

    private Long infoId;

    private String leibie;

    private String xiangmu;

    private String createTime;

    private String checked;

    private List<Stu> stus;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public List<Stu> getStus() {
        return stus;
    }

    public void setStus(List<Stu> stus) {
        this.stus = stus;
    }
}
