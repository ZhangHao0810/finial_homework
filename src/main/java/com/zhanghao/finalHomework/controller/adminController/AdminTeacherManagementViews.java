package com.zhanghao.finalHomework.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:27
 * @Description： 教师管理
 */
@Controller
public class AdminTeacherManagementViews {

    /** 2019/12/21 16:49
     * 教师管理首页 教师的查询和确认
    */
    @RequestMapping("/admin/showTeachers")
    public String adminLogin(){
        return "admin/TeacherManagement/admin_showTeachers";
    }


    /** 2019/12/21 17:06
     * 添加教师
    */
    @RequestMapping("/admin/addTeacher")
    public String adminAdd(){
        return "admin/TeacherManagement/admin_addTeacher";
    }


    /** 2019/12/21 17:06
     * 修改教师密码
    */
    @RequestMapping("/admin/updateTeacher")
    public String adminUpdate(){
        return "admin/TeacherManagement/admin_updateTeacher";
    }

}
