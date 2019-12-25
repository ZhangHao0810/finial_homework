package com.zhanghao.finalHomework.controller.teacherController;

import com.zhanghao.finalHomework.model.Teacher;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/20 16:38
 * @Description： 教师登录与注册的Controller
 */

@Controller
public class TeacherLoginRegister {

    @Autowired
    private TeacherService teacherService;

    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     *  注意了,跳到这个页面的时候,要带上: 带队老师参与的所有比赛信息,以及同比赛信息相对应的所有的学生信息.
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex() {
        return "teacher/teacher_index";
    }

    /** 2019/12/25 11:52
     * 教师登录页面
    */
    @RequestMapping("/teacher/login")
    public String teacherLogin() {
        return "teacher/teacher_login";
    }

    /**
     * 2019/12/21 9:01
     * 教师登录的具体逻辑
     */
    @RequestMapping("/teacher/login1")
    public String teacherLogin( Teacher teacher, BindingResult bindingResult, Model model) {
        System.out.println(teacher.getTeacherName());
       int result= teacherService.teacherLogin(teacher);
       if (result==1){
           return "teacher/index";
       }else if (result==2){
           return "teacher/teacher_login_NotActive";
       }else {
           return "teacher/teacher_login_fail";
       }
    }


    /**
     * 2019/12/21 9:01
     * 教师登录失败页面
     */
    @RequestMapping("/teacher/fail_login")
    public String teacherFailLogin() {
        return "teacher/teacher_login_fail";
    }

    /**
     * 2019/12/21 9:02
     * 教师注册页面
     */
    @RequestMapping("/teacher/register")
    public String teacherRegister() {
        return "teacher/teacher_register";
    }

    /**
     * 2019/12/21 9:02
     * 教师注册失败页面
     */
    @RequestMapping("/teacher/fail_register")
    public String teacherFailRegister() {
        return "teacher/teacher_register_fail";
    }

    /**
     * 2019/12/21 9:02
     * 教师注册成功页面
     */
    @RequestMapping("/teacher/success_register")
    public String teacherSuccessRegister() {
        return "teacher/teacher_register_success";
    }

}
