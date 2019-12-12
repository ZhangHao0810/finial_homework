package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.Teacher;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * Teacher数据库操作接口类
 * 
 **/

@Repository
public interface TeacherDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Teacher  selectByPrimaryKey(@Param("teacherId") Long teacherId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("teacherId") Long teacherId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(Teacher record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Teacher record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<Teacher> list4Page(@Param("record") Teacher record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(Teacher record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<Teacher> list(Teacher record);

}