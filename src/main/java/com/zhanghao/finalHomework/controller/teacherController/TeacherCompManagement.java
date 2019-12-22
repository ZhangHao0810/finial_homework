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

    /** 2019/12/21 11:12
     * 录入比赛信息 点击标题栏进入录入界面
     */
    @RequestMapping("/teacher/insert")
    public String teacherInsertCompInfo(){
        return "teacher/Comp/teacher_insertCompInfo";
    }

    /** 2019/12/21 11:13
     * 修改比赛信息 状态为未提交时,跳转到这里
     */
    @RequestMapping("/teacher/update")
    public String teacherUpdateCompInfo(){
        return "teacher/Comp/teacher_updateCompInfo";
    }

    /** 2019/12/21 11:13
     * 查看比赛信息 当状态为已提交时,跳转到这里
     */
    @RequestMapping("/teacher/show")
    public String teacherFindCompInfo(){
        return "teacher/Comp/teacher_showCompInfo";
    }

}
