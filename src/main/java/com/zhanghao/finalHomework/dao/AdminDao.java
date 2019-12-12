package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.Admin;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * Admin数据库操作接口类
 * 
 **/

@Repository
public interface AdminDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Admin  selectByPrimaryKey(@Param("adminId") Long adminId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("adminId") Long adminId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(Admin record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Admin record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<Admin> list4Page(@Param("record") Admin record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(Admin record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<Admin> list(Admin record);

}