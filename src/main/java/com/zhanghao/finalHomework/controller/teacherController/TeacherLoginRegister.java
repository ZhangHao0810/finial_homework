package com.zhanghao.finalHomework.controller.teacherController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/20 16:38
 * @Description： 教师登录与注册的Controller
 */

@Controller
public class TeacherLoginRegister {

    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex() {
        return "teacher/teacher_index";
    }

    /**
     * 2019/12/21 9:01
     * 教师登录页面
     */
    @RequestMapping("/teacher/login")
    public String teacherLogin() {
        return "teacher/teacher_login";
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
