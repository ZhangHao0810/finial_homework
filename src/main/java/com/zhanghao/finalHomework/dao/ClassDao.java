package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * Class数据库操作接口类
 * 
 **/

@Repository
public interface ClassDao{

	/** 2019/12/25 14:58
	 * 添加比赛类别
	*/
	int insert(Class record);

	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Class  selectByPrimaryKey(@Param("classId") Long classId);

	/** 2019/12/25 20:31
	 * 查-全查
	*/
	List<Class> list();

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("classId") Long classId);



	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Class record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<Class> list4Page(@Param("record") Class record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(Class record);



}