package com.zhanghao.finalHomework.model;



/**
 * 
 * 
 * 
 **/
public class Stu{


  /**学生id**/

  private Long stuId;


  /**学生姓名**/

  private String stuName;


  /**学生年龄**/

  private Integer stuAge;


  /**学生班级**/

  private String stuClass;




  public void setStuId(Long stuId) {     this.stuId = stuId;
  }


  public Long getStuId() {     return this.stuId;
  }


  public void setStuName(String stuName) {     this.stuName = stuName;
  }


  public String getStuName() {     return this.stuName;
  }


  public void setStuAge(Integer stuAge) {     this.stuAge = stuAge;
  }


  public Integer getStuAge() {     return this.stuAge;
  }


  public void setStuClass(String stuClass) {     this.stuClass = stuClass;
  }


  public String getStuClass() {     return this.stuClass;
  }

}
