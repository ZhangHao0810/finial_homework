package com.zhanghao.finalHomework.controller.teacherController;

import com.zhanghao.finalHomework.model.Comp;
import com.zhanghao.finalHomework.model.SingleTeacherAllCompInfo;
import com.zhanghao.finalHomework.model.Teacher;
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
    private  TeacherService teacherService;



    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     * 注意了,登录成功.跳到页面的时候,要带上: 带队老师参与的所有比赛信息,以及同比赛信息相对应的所有的学生信息.
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex(Teacher teacher, Model model) {
        model.addAttribute("teacher", teacher);
//        System.out.println(teacher.getTeacherName() );
        List<SingleTeacherAllCompInfo> result = compService.listSingleTeacherAllComp(teacher.getTeacherName());
        model.addAttribute("result", result);
        for (SingleTeacherAllCompInfo info : result) {
            System.out.println(info.getCompName());
        }
        return "teacher/teacher_index";
    }

    /**
     * 2019/12/21 11:12
     * 录入比赛信息 点击标题栏进入录入界面
     */
    @RequestMapping("/teacher/comp/insert")
    public String teacherInsertCompInfo(String teacherName,Model model) {
        /** 2019/12/26 22:07
         * 要能查询出他没有参与的所有的比赛信息
        */
        Long teacherId = teacherService.getTeacherId(teacherName);

        List<Comp> comps = compService.getTeacherNotInCompByTeacherId(teacherId);
        model.addAttribute("comps", comps);
        model.addAttribute("teacherName", teacherName);
        return "teacher/Comp/teacher_insertCompInfo";
    }

    /** 2019/12/27 8:09
     * 录入比赛信息的具体逻辑
    */
    @RequestMapping("/teacher/comp/insert1")
    public String teacherInsertCompInfo(String teacherName, String compName,Model model) {
        Long teacherId = teacherService.getTeacherId(teacherName);
        Teacher teacher=new Teacher();
        teacher.setTeacherName(teacherName);
        teacher.setTeacherId(teacherId);

        compService.insertSingleCompInfo(teacherId,compName,null,null,null);
        model.addAttribute("teacher", teacher);
        return "forward:index";
    }


    /**
     * 2019/12/21 11:13
     * 修改比赛信息 状态为未提交时,跳转到这里
     */
    @RequestMapping("/teacher/comp/update")
    public String teacherUpdateCompInfo() {
        return "teacher/Comp/teacher_updateCompInfo";
    }

    /**
     * 2019/12/21 11:13
     * 查看比赛信息 当状态为已提交时,跳转到这里
     */
    @RequestMapping("/teacher/comp/showSingleComp")
    public String teacherFindCompInfo() {
        return "teacher/Comp/teacher_showCompInfo";
    }

}
