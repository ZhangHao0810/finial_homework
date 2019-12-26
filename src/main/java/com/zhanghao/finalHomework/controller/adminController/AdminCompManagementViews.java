package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:27
 * @Description： 比赛管理
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminCompManagementViews {
    @Autowired
    private ClassService classService;


    /** 2019/12/21 16:04
     * 展示具体的比赛信息
     */
    @RequestMapping("/showCompInfo")
    public String adminShowCompInfo(){
        return "admin/CompManagement/admin_showCompInfo";
    }

    /** 2019/12/21 22:19
     * 展示全部的比赛信息
    */
    @RequestMapping("/showAllCompInfo")
    public String adminShowAllCompInfo(){
        return "admin/CompManagement/admin_showAllCompInfos";
    }


    /** 2019/12/21 22:12
     * 展示全部比赛类别
    */
    @RequestMapping("/compClass")
    public String adminCompClass(Model model){
        List<Class> classes= classService.getAllClass();
        model.addAttribute("list" ,classes);
        return "admin/CompManagement/admin_compClassManagement";
    }


    /** 2019/12/25 15:15
     * 添加比赛类别
    */
    @RequestMapping("/addCompClass")
    public String adminAddCompClass(){
        return "admin/CompManagement/admin_addCompClass";
    }


    /** 2019/12/22 9:00
     * 添加比赛类别的逻辑
    */
    @RequestMapping("/addCompClass1")
    public String adminAddCompClass(Class compClass){

       classService.insertClass(compClass);

       return "redirect:compClass";
    }

    /** 2019/12/25 20:48
     * 删除比赛类别
    */
    @RequestMapping("/deletClass")
    public String adminDeletCompClass(Long classId){

        classService.deletClass(classId);

        return "redirect:compClass";
    }

    /** 2019/12/21 22:14
     * 为类别添加比赛,建立比赛与类别的映射
     * 同时展示该类别下的所有比赛
    */
    @RequestMapping("/addComp")
    public String adminComp(){
        return "admin/CompManagement/admin_addCompInfo";
    }


}
