package com.zhanghao.finalHomework.controller.teacherController;

import com.zhanghao.finalHomework.model.Stu;
import com.zhanghao.finalHomework.model.Teacher;
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
 * @date 2019/12/21 9:51
 * @Description： 教师端
 */
@Controller
public class TeacherStuManagement {

    @Autowired
    private StuService stuService;

    @Autowired
    private CompService compService;

    @Autowired
    private TeacherService teacherService;


    /** 2019/12/21 12:19
     * 查看具体比赛的学生信息
    */
    @RequestMapping("/teacher/stu/index1")
    public String teacherStuIndex(Long infoId, Model model){

        /** 2019/12/26 19:57
         * 根据infoid 获得教师的姓名和比赛的名称.
        */
        Long teacherId = compService.getTeacherIdByinfoId(infoId);
        System.out.println(teacherId);
        Teacher teacher = teacherService.getTeacherByTeacherId(teacherId);

        model.addAttribute("name", teacher.getTeacherName());
        model.addAttribute("teacher", teacher);

        /** 2019/12/26 20:04
         * 根据infoid获得比赛名称
        */
        String compName = compService.getInfoByInfoid(infoId);

        model.addAttribute("infoName",compName);

        List<Stu> stus = stuService.listSingleCompAllStu(infoId);

        model.addAttribute("stus", stus);

        model.addAttribute("infoId",infoId);


        return "teacher/Stu/teacher_stuManagement";
    }


    /** 2019/12/21 12:19
     * 增添具体比赛的学生信息页面,要带上比赛名称
     */
    @RequestMapping("/teacher/stu/insert")
    public String teacherStuInsert(String teacherName,String compName,Long infoId,Model model){
        model.addAttribute("compName", compName);
        System.out.println(compName);
        model.addAttribute("infoId", infoId);
        model.addAttribute("teacherName", teacherName);
        return "teacher/Stu/teacher_stuInsert";
    }

    /** 2019/12/26 20:53
     * 添加比赛学生的具体逻辑.
    */
    @RequestMapping("/teacher/stu/insert1")
    public String teacherStuInsert(Stu stu,Long infoId,Model model){
        System.out.println(infoId);
        stuService.insertStu(stu,infoId);
        model.addAttribute("infoId", infoId);
        return "forward:index1";
    }

    /** 2019/12/26 19:50
     * 删除一条学生信息
    */
    @RequestMapping("/teacher/stu/delet")
    public String teacherStuDelet(Long stuId,Long infoId,Model model){
         stuService.deletStu(stuId);
         /** 2019/12/26 20:35
          * 删除竞赛和学生关系表的信息.
         */
        compService.deletCompStuInfoBystuId(stuId);

        model.addAttribute("infoId", infoId);
        return "forward:index1";
    }

}


