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


	/** 2019/12/25 14:04
	 * 查询(根据用户名和密码)
	*/
	Admin selectByAdminNamePassword(@Param("adminName") String adminrName,@Param("password") String password);



	/** 2019/12/25 15:31
	 * 分页查询全部的管理员信息.每页5条
	*/
	List<Admin> list4Page(@Param("record") Admin record, @Param("commonQueryParam") CommonQueryBean query);

	/** 2019/12/25 18:08
	 * 查询-根据用户名
	*/
	Admin selectByName(@Param("adminName")String adminName);


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


	/** 2019/12/25 19:53
	 * 获得管理员姓名
	*/
	String getNameById(Long adminId);

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