package com.zhanghao.finalHomework.controller.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:27
 * @Description： 比赛管理
 */
@Controller
public class AdminCompManagementViews {


    /** 2019/12/21 16:04
     * 展示具体的比赛信息
     */
    @RequestMapping("/admin/showCompInfo")
    public String adminShowCompInfo(){
        return "admin/CompManagement/admin_showCompInfo";
    }

    /** 2019/12/21 22:19
     * 展示全部的比赛信息
    */
    @RequestMapping("/admin/showAllCompInfo")
    public String adminShowAllCompInfo(){
        return "admin/CompManagement/admin_showAllCompInfos";
    }


    /** 2019/12/21 22:12
     * 比赛类别管理
    */
    @RequestMapping("/admin/compClass")
    public String adminCompClass(){
        return "admin/CompManagement/admin_compClassManagement";
    }


    /** 2019/12/22 9:00
     * 添加比赛类别
    */
    @RequestMapping("/admin/addCompClass")
    public String adminAddCompClass(){
        return "admin/CompManagement/admin_addCompClass";
    }

    /** 2019/12/21 22:14
     * 为类别添加比赛,建立比赛与类别的映射
     * 同时展示该类别下的所有比赛
    */
    @RequestMapping("/admin/addComp")
    public String adminComp(){
        return "admin/CompManagement/admin_addCompInfo";
    }


}
