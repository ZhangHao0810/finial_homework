package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.Admin;
import com.zhanghao.finalHomework.model.Teacher;
import com.zhanghao.finalHomework.service.AdminService;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/21 15:00
 * @Description： 管理员登录
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminLoginViews {

    @Autowired
    private AdminService adminService;

    @Autowired
    private TeacherService teacherService;

    /**
     * 2019/12/21 15:01
     * 管理员登录
     */
    @RequestMapping("/login")
    public String adminLogin() {
        return "admin/admin_login";
    }

    /**
     * 2019/12/25 14:02
     * 管理员登陆得具体逻辑
     */
    @RequestMapping("/login1")
    public String adminLogin(Admin admin) {
        int result = adminService.adminLogin(admin.getAdminName(), admin.getPassword());
        if (result == 1) {
            return "redirect:index1";
        } else {
            return "admin/admin_login_fail";
        }
    }
    

    /**
     * 2019/12/21 15:07
     * 管理员首页的逻辑,注意登录之后,会先跳到这里
     */
    @RequestMapping("/index1")
    public String adminIndex( Model model) {

        List<Teacher> teachers = teacherService.listNotCheckedTeacher();
        model.addAttribute("teachers", teachers);
        return "admin/admin_index";
    }
}
