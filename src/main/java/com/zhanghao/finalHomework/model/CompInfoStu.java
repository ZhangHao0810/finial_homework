package com.zhanghao.finalHomework.model;



/**
 * 
 * 
 * 
 **/
public class CompInfoStu{


  /**学生和比赛的映射id**/

  private Integer id;


  /**学生id**/

  private Long stuId;


  /**比赛信息id**/

  private Long infoId;




  public void setId(Integer id) {     this.id = id;
  }


  public Integer getId() {     return this.id;
  }


  public void setStuId(Long stuId) {     this.stuId = stuId;
  }


  public Long getStuId() {     return this.stuId;
  }


  public void setInfoId(Long infoId) {     this.infoId = infoId;
  }


  public Long getInfoId() {     return this.infoId;
  }

}
