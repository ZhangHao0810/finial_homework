package com.zhanghao.finalHomework.model;



/**
 * 
 * 
 * 
 **/
public class Admin{


  /**管理员id**/

  private Long adminId;


  /**管理员姓名**/

  private String adminName;


  /**管理员密码**/

  private String password;




  public void setAdminId(Long adminId) {     this.adminId = adminId;
  }


  public Long getAdminId() {     return this.adminId;
  }


  public void setAdminName(String adminName) {     this.adminName = adminName;
  }


  public String getAdminName() {     return this.adminName;
  }


  public void setPassword(String password) {     this.password = password;
  }


  public String getPassword() {     return this.password;
  }

}
