package com.zhanghao.finalHomework.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/21 15:00
 * @Description： 管理员登录
 */
@Controller
public class AdminLoginViews {

    /** 2019/12/21 15:01
     * 管理员登录
    */
    @RequestMapping("/admin/login")
    public String adminLogin(){
        return "admin/admin_login";
    }

    /** 2019/12/21 16:29
     * 管理员登录失败
    */
    @RequestMapping("/admin/fail_login")
    public String adminFailLogin(){
        return "admin/admin_login_fail";
    }


    /** 2019/12/21 15:07
     * 管理员首页
     */
    @RequestMapping("/admin/index")
    public String adminIndex(){
        return "admin/admin_index";
    }


}
