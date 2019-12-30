package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Autowired
    private  CompService compService;


    @RequestMapping("/searchByName")
    public String abc(String teacherName, Model model) {
        List<AllCompMessage> allMessage = compService.getAllMessage();
        List<AllCompMessage> result=new ArrayList<>();
        for (AllCompMessage allCompMessage : allMessage) {
            if(allCompMessage.getTeacherName().equals(teacherName))
            {
                result.add(allCompMessage);
            }
        }
        model.addAttribute("allcomps" ,result);
        return "admin/CompManagement/admin_showAllCompInfos";
    }



    /** 2019/12/28 10:39
     * 导出excel
     * 1.生成excel
     * 2.返回到界面上让用户下载
     */
    @RequestMapping("/excel")
    public String excel(Model model) throws Exception {

        List<AllCompMessage> allMessage = compService.getAllMessage();
        model.addAttribute("allcomps", allMessage);

        //        生成excel文件到指定目录
        compService.outExcel(allMessage);
        model.addAttribute("checkout",1);
        return "admin/CompManagement/admin_showAllCompInfos";
    }


    /** 2019/12/21 16:04
     * 点击一条比赛的时候,展示具体的比赛信息
     *
     *
     */
    @RequestMapping("/showCompInfo")
    public String adminShowCompInfo(String compName, String teacherName, Model model) {
        /** 2019/12/27 13:29
         * 获得 比赛名称,比赛类别,比赛info的证书,以及参赛学生.
         */
        Long teacherId=compService.getteacheridByteacherName(teacherName);
        model.addAttribute("compName", compName);
        Class clazz = compService.getClassByCompName(compName);
        model.addAttribute("clazz", clazz);
        CompInfo compInfo = compService.getInfoByteacherIdcompName(teacherId, compName);
        model.addAttribute("compInfo", compInfo);
        model.addAttribute("compCert", compInfo.getCompCert());
        model.addAttribute("guidecert", compInfo.getGuideCert());
        model.addAttribute("compPhoto", compInfo.getCompPhoto());
        List<Stu> stus = compService.getStuByinfoid(compInfo.getInfoId());
        model.addAttribute("stus", stus);
        model.addAttribute("teacherName", teacherName);
        return "admin/CompManagement/admin_showCompInfo";
    }



    /** 2019/12/21 22:19
     * 展示全部的比赛信息
    */
    @RequestMapping("/showAllCompInfo")
    public String adminShowAllCompInfo(Model model){

        List<AllCompMessage> allMessage = compService.getAllMessage();
        model.addAttribute("allcomps", allMessage);
        model.addAttribute("checkout", 0);
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
     *
     * 展示该类别下的所有比赛,跳转到类别添加比赛页面
    */
    @RequestMapping("/addComp")
    public String adminComp(Long classId,Model model){
        /** 2019/12/27 15:49
         * 根据classid找到所有的compname
        */
        List<Comp> comps = compService.listAllComp(classId);
        model.addAttribute("comps", comps);
        Class compClass = classService.getClassByClassId(classId);
        model.addAttribute("clazz", compClass);
        return "admin/CompManagement/admin_addCompInfo";
    }

    /** 2019/12/27 15:59
     * 为具体类别添加比赛的具体逻辑
    */
    @RequestMapping("/addComp1")
    public String adminComp1(Long classId,String compName,Model model){

        /** 2019/12/30 11:29
         * 1.比赛名称不可重复.
        */
       if(!compService.checkcompname(compName)) {
           compService.insertComp(classId, compName);
           model.addAttribute("classId", classId);
           return "forward:addComp";
       }else {
           List<Comp> comps = compService.listAllComp(classId);
           model.addAttribute("comps", comps);
           Class compClass = classService.getClassByClassId(classId);
           model.addAttribute("clazz", compClass);
           return "admin/CompManagement/admin_addCompInfo_fail";
       }


    }

    /** 2019/12/27 16:53
     * 修改比赛类别
    */
    @RequestMapping("/update")
    public String adminComp1(Long classId,BigDecimal base, BigDecimal factor, Model model){

        compService.updateclass(classId,base,factor);
        model.addAttribute("classId", classId);
        return "forward:compClass";
    }

    /** 2019/12/27 16:31
     * 删除比赛
     *
     *  一定要记住,同时把跟这个比赛有关的info也都删除了. 连同学生也应该删除!!!!
    */
    @RequestMapping("/deletComp")
    public String adminDeletComp(Long compId,Long classId,Model model){

        compService.deletCompBycompId(compId);
        model.addAttribute("classId", classId);



        return "forward:addComp";
    }


}
