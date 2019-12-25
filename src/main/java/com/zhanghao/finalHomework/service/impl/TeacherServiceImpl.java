package com.zhanghao.finalHomework.service.impl;

import com.zhanghao.finalHomework.dao.TeacherDao;
import com.zhanghao.finalHomework.model.Teacher;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/25 10:21
 * @Description： 教师逻辑
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public int teacherLogin(Teacher teacher) {
        /** 2019/12/25 10:54
         * 1. 检查老师的姓名和密码.如果都成功,再检查是否激活,如果激活,就返回1 直接进入教师首页
         * 如果查出来checke是0 就返回2 进入提示未激活的页面
         * 老师姓名和密码查不出来,就算失败, 进入提示检查用户名和面的页面
         */
        Teacher result = teacherDao.selectByNamePassWord(teacher.getTeacherName(), teacher.getPassword());
        System.out.println(result);
        if (result != null) {
            if (teacherDao.selectChecked(teacher.getTeacherName()) == 1) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    @Override
    public int teacherRegister(Teacher teacher) {
        /** 2019/12/25 12:49
         * 1.检查老师的姓名,没有重复,进行教师数据插入,注意sql中要标记checked为0  返回1
         * 教师姓名有重复,返回0 跳转到注册失败界面
        */
        Teacher result=teacherDao.selectByName(teacher.getTeacherName());
        if(result==null){
            teacherDao.insert(teacher);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Teacher> listNotCheckedTeacher() {
        /** 2019/12/25 13:01
         * 查询所有教师的
        */
        return null;
    }

    @Override
    public List<Teacher> listCheckedTeacher() {
        return null;
    }

    @Override
    public int checkTeacher(Long teacherId) {
        return 0;
    }

    @Override
    public int notCheckTeacher(Long teacherId) {
        return 0;
    }

    @Override
    public String getTeacherName(Long stuId) {
        return null;
    }

    @Override
    public Long getTeacherId(String stuName) {
        return null;
    }

    @Override
    public int insertTeacher(String teacherName, String password) {
        return 0;
    }

    @Override
    public int deletTeacher(Long teacherId) {
        return 0;
    }

    @Override
    public int updateTeacher(Long teacherId) {
        return 0;
    }
}
