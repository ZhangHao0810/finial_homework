package com.zhanghao.finalHomework.controller.teacherController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/22 9:16
 * @Description： 教师比赛管理
 */
@Controller
public class TeacherCompManagement {

    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     * 注意了,跳到这个页面的时候,要带上: 带队老师参与的所有比赛信息,以及同比赛信息相对应的所有的学生信息.
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex() {
        return "teacher/teacher_index";
    }

    /**
     * 2019/12/21 11:12
     * 录入比赛信息 点击标题栏进入录入界面
     */
    @RequestMapping("/teacher/comp/insert")
    public String teacherInsertCompInfo() {
        return "teacher/Comp/teacher_insertCompInfo";
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
