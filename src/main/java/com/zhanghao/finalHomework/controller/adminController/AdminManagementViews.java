package com.zhanghao.finalHomework.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:24
 * @Description：
 */
@Controller
public class AdminManagementViews {

    /** 2019/12/21 16:26
     * 添加管理员
    */
    @RequestMapping("/admin/addAdmin")
    public String adminAdd(){
        return "admin/AdminManagement/admin_addAdmin";
    }

    /** 2019/12/21 16:26
     * 修改管理员密码
    */
    @RequestMapping("/admin/updateAdmin")
    public String adminUpadte(){
        return "admin/AdminManagement/admin_updateAdmin";
    }

    /** 2019/12/21 16:34
     * 展示全部管理员
    */
    @RequestMapping("/admin/showAdmin")
    public String adminShow(){
        return "admin/AdminManagement/admin_showAdmin";
    }



}
