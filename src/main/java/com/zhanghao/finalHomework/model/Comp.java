package com.zhanghao.finalHomework.model;



/**
 * 
 * 
 * 
 **/
public class Comp{


  /**比赛id**/

  private Long compId;


  /**比赛名**/

  private String compName;


  /**比赛类别id**/

  private Long classId;




  public void setCompId(Long compId) {     this.compId = compId;
  }


  public Long getCompId() {     return this.compId;
  }


  public void setCompName(String compName) {     this.compName = compName;
  }


  public String getCompName() {     return this.compName;
  }


  public void setClassId(Long classId) {     this.classId = classId;
  }


  public Long getClassId() {     return this.classId;
  }

}
