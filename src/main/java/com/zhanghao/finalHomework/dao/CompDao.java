package com.zhanghao.finalHomework.dao;

import com.zhanghao.finalHomework.model.Comp;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * Comp数据库操作接口类
 * 
 **/

@Repository
public interface CompDao{

	/** 2019/12/25 13:43
	 * 查询出所有的比赛名称
	 * 用途:录入比赛信息界面之前需要查
	*/
	List<Comp> selectAllComp();


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Comp  selectByPrimaryKey(@Param("compId") Long compId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(@Param("compId") Long compId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(Comp record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Comp record);

	/**
	 * 
	 * list分页查询
	 * 
	 **/
	List<Comp> list4Page(@Param("record") Comp record, @Param("commonQueryParam") CommonQueryBean query);

	/**
	 * 
	 * count查询
	 * 
	 **/
	long count(Comp record);

	/**
	 * 
	 * list查询
	 * 
	 **/
	List<Comp> list(Comp record);

    List<Comp> getCompByTeacherId(Long teacherId);

    Comp getCompBycompName(String compName);

    List<Comp> selectInversByPrimaryKey(Long compId);

    List<Comp> getCompByclassId(Long classId);

	List<Comp> checkcompName(String compName);
}