package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.Stu;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * Stu数据库操作接口类
 * 
 **/

@Repository
public interface StuDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Stu  selectByPrimaryKey(@Param("stuId") Long stuId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("stuId") Long stuId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(Stu record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Stu record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<Stu> list4Page(@Param("record") Stu record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(Stu record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<Stu> list(Stu record);

}