package com.zhanghao.finalHomework.model;

import java.util.Date;


/**
 * 
 * 比赛信息实体
 * 
 **/
public class CompInfo{


  /**比赛信息id**/

  private Long infoId;


  /**教师id**/

  private Long teacherId;


  /**学生id**/

  private Long stuId;


  /**比赛id**/

  private Long compId;


  /**比赛照片**/

  private byte[] compPhoto;


  /**比赛证书**/

  private byte[] compCert;


  /**指导证书**/

  private byte[] guideCert;


  /**是否提交,1提交,0仅保存.**/

  private Integer checked;


  /**比赛信息创建时间.**/

  private Date createTime;


  /**比赛信息修改时间**/

  private Date updateTime;




  public void setInfoId(Long infoId) { 
    this.infoId = infoId;
  }


  public Long getInfoId() { 
    return this.infoId;
  }


  public void setTeacherId(Long teacherId) { 
    this.teacherId = teacherId;
  }


  public Long getTeacherId() { 
    return this.teacherId;
  }


  public void setStuId(Long stuId) { 
    this.stuId = stuId;
  }


  public Long getStuId() { 
    return this.stuId;
  }


  public void setCompId(Long compId) { 
    this.compId = compId;
  }


  public Long getCompId() { 
    return this.compId;
  }


  public void setCompPhoto(byte[] compPhoto) { 
    this.compPhoto = compPhoto;
  }


  public byte[] getCompPhoto() { 
    return this.compPhoto;
  }


  public void setCompCert(byte[] compCert) { 
    this.compCert = compCert;
  }


  public byte[] getCompCert() { 
    return this.compCert;
  }


  public void setGuideCert(byte[] guideCert) { 
    this.guideCert = guideCert;
  }


  public byte[] getGuideCert() { 
    return this.guideCert;
  }


  public void setChecked(Integer checked) { 
    this.checked = checked;
  }


  public Integer getChecked() { 
    return this.checked;
  }


  public void setCreateTime(Date createTime) { 
    this.createTime = createTime;
  }


  public Date getCreateTime() { 
    return this.createTime;
  }


  public void setUpdateTime(Date updateTime) { 
    this.updateTime = updateTime;
  }


  public Date getUpdateTime() { 
    return this.updateTime;
  }

}
