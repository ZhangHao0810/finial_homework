package com.zhanghao.finalHomework.service;

import com.zhanghao.finalHomework.model.Stu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/23 15:46
 * @Description： 学生的增删查逻辑,改就是删了再增.
 */
@Service
public interface StuService {

    /** 2019/12/23 15:47
     * 根据比赛ID查询某项比赛的全部学生,返回学生对象的list集合.
     * 用于:
     *  教师首页的模态框
     *  教师的学生管理首页
     *  管理员的信息统计页面
    */
    List<Stu> listSingleCompAllStu(Long infoId);

    /** 2019/12/23 15:58
     * 插入学生信息,同时添加具体比赛与学生的映射.
     * 用于:
     *  教师的学生管理之增加学生
     *
    */
    int insertStu(Stu stu,Long infoId);

    /** 2019/12/23 16:13
     * 删除学生信息,同时删除具体比赛与学生的映射.
    */
    int deletStu(Long stuId);

    /** 2019/12/23 21:29
     * 统计 每条比赛的参赛学生数,在管理员展示全部比赛信息,做信息统计时候使用.
    */
    int countStuNum(Long stuId);


}
