package com.zhanghao.finalHomework.controller.teacherController;

import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import com.zhanghao.finalHomework.service.StuService;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/22 9:16
 * @Description： 教师比赛管理
 */
@Controller
public class TeacherCompManagement {

    @Autowired
    private CompService compService;

    @Autowired
    private ClassService classService;

    @Autowired
    private StuService stuService;

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teacher/index1")
    public String teacherIndex(String teacherName, Model model) {

        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        model.addAttribute("teacher", teacher);
        return "forward:index";
    }

    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     * 注意了,登录成功.跳到页面的时候,要带上: 带队老师参与的所有比赛信息,以及同比赛信息相对应的所有的学生信息.
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex(Teacher teacher, Model model) {
        Long teacherId = teacherService.getTeacherId(teacher.getTeacherName());
        Teacher teacher1=new Teacher();
        teacher1.setTeacherName(teacher.getTeacherName());
        teacher1.setTeacherId(teacherId);
        model.addAttribute("teacher", teacher1);
        System.out.println(teacher.getTeacherName());
        List<SingleTeacherAllCompInfo> result = compService.listSingleTeacherAllComp(teacher.getTeacherName());
        model.addAttribute("result", result);
        for (SingleTeacherAllCompInfo info : result) {
            System.out.println(teacher.getTeacherName());
            System.out.println(info.getCompName());
        }
        return "teacher/teacher_index";
    }

    /**
     * 2019/12/21 11:12
     * 录入比赛信息 点击标题栏进入录入界面
     */
    @RequestMapping("/teacher/comp/insert")
    public String teacherInsertCompInfo(String teacherName, Model model) {
        /** 2019/12/26 22:07
         * 要能查询出他没有参与的所有的比赛信息
         */
        Long teacherId = teacherService.getTeacherId(teacherName);

        List<Comp> comps = compService.getTeacherNotInCompByTeacherId(teacherId);
        model.addAttribute("comps", comps);
        model.addAttribute("teacherName", teacherName);
        return "teacher/Comp/teacher_insertCompInfo";
    }

    /**
     * 2019/12/27 8:09
     * 提交比赛信息的具体逻辑
     */
    @RequestMapping("/teacher/comp/insert1")
    public String teacherInsertCompInfo(String teacherName, String compName, Model model) {
        Long teacherId = teacherService.getTeacherId(teacherName);
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        teacher.setTeacherId(teacherId);

        compService.insertSingleCompInfo(teacherId, compName, null, null, null);
        model.addAttribute("teacher", teacher);
        return "forward:/teacher/index";
    }

    /**
     * 2019/12/27 13:19
     * 保存比赛信息的逻辑
     */
    @RequestMapping("/teacher/comp/insert2")
    public String teacherInsertCompInfo2(String teacherName, String compName, Model model) {
        Long teacherId = teacherService.getTeacherId(teacherName);
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        teacher.setTeacherId(teacherId);

        compService.saveSingleCompInfo(teacherId, compName, null, null, null);
        model.addAttribute("teacher", teacher);
        return "forward:/teacher/index";
    }

    /**
     * 2019/12/21 11:13
     * 修改比赛信息 状态为未提交时,跳转到这里
     */
    @RequestMapping("/teacher/comp/update")
    public String teacherUpdateCompInfo(String compName, Long teacherId, Model model) {
        model.addAttribute("compName", compName);
        model.addAttribute("teacherId", teacherId);
        return "teacher/Comp/teacher_updateCompInfo";
    }

    /**
     * 2019/12/27 12:51
     * 更新比赛信息的具体逻辑
     * 先根据比赛id和教师id删除info,然后再跳转到添加比赛页面进行添加.
     */
    @RequestMapping("/teacher/comp/update1")
    public String teacherUpdateCompInfo1(String compName, Long teacherId, Model model) {
        compService.deletInfoByteacherIdCompName(compName, teacherId);
        String teacherName = teacherService.getTeacherName(teacherId);
        model.addAttribute("compName", compName);
        model.addAttribute("teacherName", teacherName);
        return "forward:teacher/comp/insert1";
    }

    /**
     * 2019/12/21 11:13
     * 查看比赛信息 当状态为已提交时,跳转到这里
     */
    @RequestMapping("/teacher/comp/showSingleComp")
    public String teacherFindCompInfo(String compName, Long teacherId, Model model) {
        /** 2019/12/27 13:29
         * 获得 比赛名称,比赛类别,比赛info的证书,以及参赛学生.
         */
        model.addAttribute("compName", compName);
        Class clazz = compService.getClassByCompName(compName);
        model.addAttribute("clazz", clazz);
        CompInfo compInfo = compService.getInfoByteacherIdcompName(teacherId, compName);
        model.addAttribute("compInfo", compInfo);
        List<Stu> stus = compService.getStuByinfoid(compInfo.getInfoId());
        model.addAttribute("stus", stus);
        return "teacher/Comp/teacher_showCompInfo";
    }

}
