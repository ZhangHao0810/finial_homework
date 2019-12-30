package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.Teacher;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:27
 * @Description： 教师管理
 */
@Controller
public class AdminTeacherManagementViews {

    @Autowired
    private TeacherService teacherService;

    /**
     * 2019/12/21 16:49
     * 教师管理首页 教师的查询和确认
     */
    @RequestMapping("/admin/showTeachers")
    public String adminLogin(Model model) {
        /** 2019/12/25 20:54
         * 展示待激活教师名单,和已激活教师名单.
         */
        List<Teacher> checked = teacherService.listCheckedTeacher();
        List<Teacher> notchecked = teacherService.listNotCheckedTeacher();
        model.addAttribute("checked", checked);
        model.addAttribute("notChecked", notchecked);
        return "admin/TeacherManagement/admin_showTeachers";
    }

    /**
     * 2019/12/25 21:08
     * 授权教师信息
     */
    @RequestMapping("/admin/activeTachers")
    public String activeTachers(Long teacherId) {
        teacherService.checkTeacher(teacherId);
        return "redirect:showTeachers";
    }

    /**
     * 2019/12/21 17:06
     * 添加教师
     */
    @RequestMapping("/admin/addTeacher")
    public String addTeacher() {
        return "admin/TeacherManagement/admin_addTeacher";
    }

    /**
     * 2019/12/25 21:45
     * 添加教师的具体逻辑
     */
    @RequestMapping("/admin/addTeacher1")
    public String addTeacher(Teacher teacher) {
        /** 2019/12/30 16:11
         * 1.判断教师姓名是否重复 如果重复,返回失败页面,不重复,根据教师姓名来添加教师,返回展示教师页面
         */
        int result = teacherService.insertTeacher(teacher);
        if (result == 1) {
            return "redirect:showTeachers";
        } else {
            return "admin/TeacherManagement/admin_addTeacher_fail";
        }
    }

    /**
     * 2019/12/25 21:24
     * 删除教师信息,拒绝教师信息
     */
    @RequestMapping("/admin/deletTeacher")
    public String deletTeacher(Long teacherId) {
        teacherService.deletTeacher(teacherId);
        return "redirect:showTeachers";
    }

    /**
     * 2019/12/21 17:06
     * 修改教师密码
     */
    @RequestMapping("/admin/updateTeacher")
    public String adminUpdate(String teacherName, Model model) {
        model.addAttribute("teacherName", teacherName);
        return "admin/TeacherManagement/admin_updateTeacher";
    }

    /**
     * 2019/12/30 16:10
     * 修改教师的具体逻辑
     */
    @RequestMapping("/admin/updateTeacher1")
    public String adminUpdate1(String teacherName, String password ) {

        teacherService.updateTeacher(teacherName, password);

        return "forward:/admin/showTeachers";

    }

}
