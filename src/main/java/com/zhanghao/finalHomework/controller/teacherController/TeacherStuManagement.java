package com.zhanghao.finalHomework.controller.teacherController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/21 9:51
 * @Description： 教师端
 */
@Controller
public class TeacherStuManagement {


    /** 2019/12/21 12:19
     * 查看具体比赛的学生信息
    */
    @RequestMapping("/teacher/stu/index")
    public String teacherStuIndex(){
        return "teacher/Stu/teacher_stuManagement";
    }


    /** 2019/12/21 12:19
     * 增添具体比赛的学生信息
     */
    @RequestMapping("/teacher/stu/insert")
    public String teacherStuInsert(){
        return "teacher/Stu/teacher_stuInsert";
    }

}


