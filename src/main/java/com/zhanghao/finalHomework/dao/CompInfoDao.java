package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.CompInfo;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * CompInfo数据库操作接口类
 * 
 **/

@Repository
public interface CompInfoDao{


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	CompInfo  selectByPrimaryKey(@Param("infoId") Long infoId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("infoId") Long infoId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(CompInfo record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(CompInfo record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<CompInfo> list4Page(@Param("record") CompInfo record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(CompInfo record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<CompInfo> list(CompInfo record);

}