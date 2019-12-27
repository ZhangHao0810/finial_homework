package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.CompInfoStu;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * CompInfoStu数据库操作接口类
 * 
 **/

@Repository
public interface CompInfoStuDao{



	/** 2019/12/26 12:02
	 * 根据infoid 查 sid
	*/

	List<CompInfoStu> getStuIdByInfoId(@Param("infoId")Long infoId);


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	CompInfoStu  selectByPrimaryKey(@Param("id") Integer id);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("id") Integer id);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(CompInfoStu record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(CompInfoStu record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<CompInfoStu> list4Page(@Param("record") CompInfoStu record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(CompInfoStu record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<CompInfoStu> list(CompInfoStu record);


    void deletBystuId(@Param("stuId")Long stuId);
}