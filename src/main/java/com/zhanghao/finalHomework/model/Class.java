package com.zhanghao.finalHomework.model;

import java.math.BigDecimal;


/**
 * 
 * 比赛类别的实体
 * 
 **/
public class Class{


  /**比赛类别id**/

  private Long classId;


  /**类别(ABC类)**/

  private String category;


  /**等级(一、二、三等)**/

  private String grade;


  /**基数**/

  private BigDecimal base;


  /**系数**/

  private BigDecimal factor;




  public void setClassId(Long classId) { 
    this.classId = classId;
  }


  public Long getClassId() { 
    return this.classId;
  }


  public void setCategory(String category) { 
    this.category = category;
  }


  public String getCategory() { 
    return this.category;
  }


  public void setGrade(String grade) { 
    this.grade = grade;
  }


  public String getGrade() { 
    return this.grade;
  }


  public void setBase(BigDecimal base) { 
    this.base = base;
  }


  public BigDecimal getBase() { 
    return this.base;
  }


  public void setFactor(BigDecimal factor) { 
    this.factor = factor;
  }


  public BigDecimal getFactor() { 
    return this.factor;
  }

}
