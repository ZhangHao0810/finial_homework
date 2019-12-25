package com.zhanghao.finalHomework.service;

import com.zhanghao.finalHomework.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/23 15:15
 * @Description： 老师的逻辑
 */
@Service
public interface TeacherService {

    /**
     * 2019/12/23 15:18
     * 教师的登录
     */
    int teacherLogin(Teacher teacher);

    /**
     * 2019/12/23 15:45
     * 教师的注册
     */
    int teacherRegister(Teacher teacher);

    /**
     * 2019/12/23 18:34
     * 展示待确认教师信息.
     * 用途:
     *  教师管理首页 展示待确认教师信息
     */
    List<Teacher> listNotCheckedTeacher();

    /**
     * 2019/12/23 19:11
     * 展示已经 确认的教师的教师信息.
     */
    List<Teacher> listCheckedTeacher();

    /**
     * 2019/12/23 18:35
     * 授权教师的注册信息
     */
    int checkTeacher(Long teacherId);

    /** 2019/12/23 18:36
     * 拒绝教师的注册请求(删除教师的信息)
    */
    int notCheckTeacher(Long teacherId);

    /**
     * 2019/12/23 18:52
     * 根据教师id 来获得 教师的姓名
     * 用途:
     * 管理员首页,右侧展示最新比赛信息.
     */
    String getTeacherName(Long stuId);

    /**
     * 2019/12/23 21:34
     * 根据教师姓名,获得教师的id
     */
    Long getTeacherId(String stuName);

    /** 2019/12/23 19:13
     * 添加教师信息
     * 管理员的教师管理
    */
    int insertTeacher(String teacherName,String password);

    /** 2019/12/23 19:23
     * 删除教师信息
    */
    int deletTeacher(Long teacherId);

    /** 2019/12/23 19:24
     * 修改教师密码
    */
    int updateTeacher(Long teacherId);




}
