package com.zhanghao.finalHomework.service;

import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.model.Class;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/23 15:19
 * @Description： 比赛信息的查询, 包含具体比赛信息以及 比赛名称和比赛类别
 */
@Service
public interface CompService {

    /** 2019/12/27 19:57
     * 删除唯一教师的单一比赛的逻辑
    */
    void deletSingleTeacherSingleCompInfo(Long teacherId,String compName);


    /**
     * 2019/12/23 15:30
     * 查询单个教师参与的全部比赛名称
     * 用途:
     * 教师端首页
     */
    List<SingleTeacherAllCompInfo> listSingleTeacherAllComp(String teacherName);

    List<CompInfo> listSingleTeacherAllCompInfo(String teacherName);

    /**
     * 2019/12/23 16:26
     * 单个老师的某项比赛查询
     * 教师的比赛查询
     */
    List<Comp> listSingleTeacherComp(String compName);


    /** 2019/12/23 21:54
     * 根据CompId 查Comp
    */
    Comp getComp(Long compId);

    /**
     * 2019/12/23 18:46
     * 按照时间排序,展示最新比赛信息
     * 用途: String compName, Long teacherId, Model model
     * 管理员首页右侧 注意,这个最新的比赛信息里面,没有带队老师名字,要在Controller中转换.
     */
    List<NewestCompInfo> listNewestCompInfos();

    /**
     * 2019/12/23 21:27
     * 展示全部的比赛信息 用作输出
     */
    List<CompInfo> listAllCompInfo();

    /**
     * 2019/12/23 16:27
     * 某教师新增比赛信息
     * 用途:
     * 教师端 录入比赛信息
     */
    int insertSingleCompInfo(Long teacherId, String compName, String compPhoto, String compCert, String guideCert);

    /**
     * 2019/12/23 18:26
     * 修改比赛信息
     * 用途:
     * 教师端 未提交的比赛,可以修改.更新数据库中的字段信息.
     */
    int updateSingleCompInfo(Long teacherId, String compName, String compPhoto, String compCert, String guideCert);

    /** 2019/12/23 21:31
     * 在全部比赛信息中按照比赛名称查询.
    */
    List<Comp> listAllCompInfo(String compName);

    /** 2019/12/23 21:32
     * 全部比赛信息中,按照带队老师查询
    */
    List<CompInfo> listAllCompInfo(Long teacherId);

    /** 2019/12/23 21:32
     * 知道类别id,查全部的comp
    */
    List<Comp> listAllComp(Long classId);

    /** 2019/12/23 21:52
     * 为某一类别添加比赛
    */
    int insertComp(Long classId,String compName);

    /** 2019/12/26 19:59
     * 知道infoid 查 教师id
    */
    Long getTeacherIdByinfoId(Long infoId);

    /** 2019/12/26 20:04
     * 知道infoid 查 info
    */
    String getInfoByInfoid(Long infoId);


    /** 2019/12/27 16:29
     * 管理员 删除比赛
    */
    void deletCompBycompId(Long compId);

    /** 2019/12/26 20:37
     * 根据stuid 删除学生比赛关系表中的学生
    */
    void deletCompStuInfoBystuId(Long stuId);

    List<Comp> getallCompByTeacherId(Long teacherId);


    List<Comp> getTeacherNotInCompByTeacherId(Long teacherId);

    void deletInfoByteacherIdCompName(String compName, Long teacherId);

    void saveSingleCompInfo(Long teacherId, String compName, String o, String o1, String o2);

    Class getClassByCompName(String compName);

    CompInfo getInfoByteacherIdcompName(Long teacherId, String compName);

    List<Stu> getStuByinfoid(Long infoId);

    /**
     * 2019/12/27 14:42
     * 查询比赛信息的数量
     */
    Long countCompInfoNum(CompInfo compInfo);

    void updateclass(Long classId,BigDecimal base, BigDecimal factor);

    List<AllCompMessage> getAllMessage();

    Long getteacheridByteacherName(String teacherName);

    void outExcel(List<AllCompMessage> allMessage) throws Exception;

    boolean checkcompname(String compName);
}
