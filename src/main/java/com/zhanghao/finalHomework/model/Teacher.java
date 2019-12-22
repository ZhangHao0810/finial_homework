package com.zhanghao.finalHomework.model;



/**
 * 
 * 
 * 
 **/
public class Teacher{


  /**教师id**/

  private Long teacherId;


  /**教师姓名**/

  private String teacherName;


  /**教师密码**/

  private String password;


  /**是否经管理员确认 0否,1是**/

  private Integer checked;




  public void setTeacherId(Long teacherId) {     this.teacherId = teacherId;
  }


  public Long getTeacherId() {     return this.teacherId;
  }


  public void setTeacherName(String teacherName) {     this.teacherName = teacherName;
  }


  public String getTeacherName() {     return this.teacherName;
  }


  public void setPassword(String password) {     this.password = password;
  }


  public String getPassword() {     return this.password;
  }


  public void setChecked(Integer checked) {     this.checked = checked;
  }


  public Integer getChecked() {     return this.checked;
  }

}
