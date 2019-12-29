package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
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


    /** 2019/12/28 10:39
     * 导出excel
     * 1.生成excel
     * 2.返回到界面上让用户下载
     */
    @RequestMapping("/excel")
    public String excel(HttpServletResponse response) throws Exception {
        List<AllCompMessage> allMessage = compService.getAllMessage();
        compService.outExcel(allMessage);


        String filename="testXSSF.xlsx";
        String filePath = "" ;
        File file = new File(filePath + "/" + filename);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" + filename);

            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;

            OutputStream os ; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("----------file download" + filename);
            try {
                if (bis != null) {
                    bis.close();
                    fis.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return "forward:/admin/showAllCompInfo";
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
        List<Stu> stus = compService.getStuByinfoid(compInfo.getInfoId());
        model.addAttribute("stus", stus);
        return "admin/CompManagement/admin_showCompInfo";
    }



    /** 2019/12/21 22:19
     * 展示全部的比赛信息
    */
    @RequestMapping("/showAllCompInfo")
    public String adminShowAllCompInfo(Model model){

        List<AllCompMessage> allMessage = compService.getAllMessage();
        model.addAttribute("allcomps", allMessage);
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

        compService.insertComp(classId, compName);
        model.addAttribute("classId", classId);
        return "forward:addComp";
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
     *  一定要记住,同时把跟这个比赛有关的info也都删除了.
    */
    @RequestMapping("/deletComp")
    public String adminDeletComp(Long compId,Long classId,Model model){

        compService.deletCompBycompId(compId);
        model.addAttribute("classId", classId);



        return "forward:addComp";
    }


}
