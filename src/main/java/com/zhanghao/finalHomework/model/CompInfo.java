package com.zhanghao.finalHomework.model;

import java.util.Date;


/**
 * 
 * 
 * 
 **/
public class CompInfo{


  /**比赛信息id**/

  private Long infoId;


  /**教师id**/

  private Long teacherId;


  /**比赛id**/

  private Long compId;


  /**比赛照片**/

  private String  compPhoto;


  /**比赛证书**/

  private String compCert;


  /**指导证书**/

  private String guideCert;


  /**是否提交,1提交,0仅保存.**/

  private Integer checked;


  /**比赛信息创建时间.**/

  private Date createTime;


  /**比赛信息修改时间**/

  private Date updateTime;

  public Long getInfoId() {
    return infoId;
  }

  public void setInfoId(Long infoId) {
    this.infoId = infoId;
  }

  public Long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
  }

  public Long getCompId() {
    return compId;
  }

  public void setCompId(Long compId) {
    this.compId = compId;
  }

  public String getCompPhoto() {
    return compPhoto;
  }

  public void setCompPhoto(String compPhoto) {
    this.compPhoto = compPhoto;
  }

  public String getCompCert() {
    return compCert;
  }

  public void setCompCert(String compCert) {
    this.compCert = compCert;
  }

  public String getGuideCert() {
    return guideCert;
  }

  public void setGuideCert(String guideCert) {
    this.guideCert = guideCert;
  }

  public Integer getChecked() {
    return checked;
  }

  public void setChecked(Integer checked) {
    this.checked = checked;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
