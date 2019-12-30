package com.zhanghao.finalHomework.controller.teacherController;

import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import com.zhanghao.finalHomework.service.StuService;
import com.zhanghao.finalHomework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
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
    public String teacherIndex( String teacherName, Model model) {

        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        model.addAttribute("teacher", teacher);
        return "forward:index";
    }

    @RequestMapping(value = "/teacher/comp/delet")
    public String teach(String compName, Long teacherId, String teacherName, Model model) {
        /** 2019/12/27 20:12
         * 1.直接调服务
         * 2.跳到教师首页
         */
        compService.deletInfoByteacherIdCompName(compName, teacherId);

//        Teacher teacher = teacherService.getTeacherByTeacherId(teacherId);
        model.addAttribute("teacherId", teacherId);
        model.addAttribute("teacherName", teacherName);
        return "forward:/teacher/index";
    }

    /**
     * 2019/12/21 9:01
     * 教师首页 默认页面
     * 注意了,登录成功.跳到页面的时候,要带上: 带队老师参与的所有比赛信息,以及同比赛信息相对应的所有的学生信息.
     */
    @RequestMapping("/teacher/index")
    public String teacherIndex(Teacher teacher, Model model) {
        Long teacherId;
        if (teacher.getTeacherId() == null) {
            teacherId = teacherService.getTeacherId(teacher.getTeacherName());
        } else {
            teacherId = teacher.getTeacherId();
        }
        Teacher teacher1 = new Teacher();
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
     *
     */
    @RequestMapping("/teacher/comp/insert1")
    public String teacherInsertCompInfo(@RequestParam("compCert") MultipartFile compCert,@RequestParam("guideCert") MultipartFile guideCert, @RequestParam("compPhoto") MultipartFile compPhoto,String teacherName, String compName, Model model) throws Exception {

//        没有设置路径,会保存在项目的根路径下.  "//"+compCert.getOriginalFilename(); teacherName+"//"+compName+"//"
        String compCertfilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/compCert/";
        File fp = new File(compCertfilePath);
        // 创建目录
        if (!fp.exists()) {
            fp.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file = new File(compCertfilePath+compCert.getOriginalFilename());
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
        outputStream.write(compCert.getBytes());
        outputStream.flush();
        outputStream.close();


        String guideCertfilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/guideCert/";
        File fp2 = new File(guideCertfilePath);
        // 创建目录
        if (!fp2.exists()) {
            fp2.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file2 = new File(guideCertfilePath+guideCert.getOriginalFilename());
        BufferedOutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
        outputStream2.write(compCert.getBytes());
        outputStream2.flush();
        outputStream2.close();


        String compPhotofilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/compPhoto/";
        File fp3 = new File(compPhotofilePath);
        // 创建目录
        if (!fp3.exists()) {
            fp3.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file3 = new File(compPhotofilePath+compPhoto.getOriginalFilename());
        BufferedOutputStream outputStream3 = new BufferedOutputStream(new FileOutputStream(file3));
        outputStream3.write(compCert.getBytes());
        outputStream3.flush();
        outputStream3.close();


        Long teacherId = teacherService.getTeacherId(teacherName);
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        teacher.setTeacherId(teacherId);

        compService.insertSingleCompInfo(teacherId, compName, compPhoto.getOriginalFilename(), compCert.getOriginalFilename(), guideCert.getOriginalFilename());
        model.addAttribute("teacher", teacher);
        return "forward:/teacher/index";
    }

    /**
     * 2019/12/27 13:19
     * 保存比赛信息的逻辑
     */
    @RequestMapping("/teacher/comp/insert2")
    public String teacherInsertCompInfo2(@RequestParam("compCert") MultipartFile compCert,@RequestParam("guideCert") MultipartFile guideCert, @RequestParam("compPhoto") MultipartFile compPhoto,String teacherName, String compName, Model model) throws IOException {

        //        没有设置路径,会保存在项目的根路径下.  "//"+compCert.getOriginalFilename(); teacherName+"//"+compName+"//"
        String compCertfilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/compCert/";
        File fp = new File(compCertfilePath);
        // 创建目录
        if (!fp.exists()) {
            fp.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file = new File(compCertfilePath+compCert.getOriginalFilename());
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
        outputStream.write(compCert.getBytes());
        outputStream.flush();
        outputStream.close();


        String guideCertfilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/guideCert/";
        File fp2 = new File(guideCertfilePath);
        // 创建目录
        if (!fp2.exists()) {
            fp2.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file2 = new File(guideCertfilePath+guideCert.getOriginalFilename());
        BufferedOutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
        outputStream2.write(compCert.getBytes());
        outputStream2.flush();
        outputStream2.close();


        String compPhotofilePath="src/main/webapp/upload/"+teacherName+"/"+compName+"/compPhoto/";
        File fp3 = new File(compPhotofilePath);
        // 创建目录
        if (!fp3.exists()) {
            fp3.mkdirs();// 目录不存在的情况下，创建目录。
        }
        File file3 = new File(compPhotofilePath+compPhoto.getOriginalFilename());
        BufferedOutputStream outputStream3 = new BufferedOutputStream(new FileOutputStream(file3));
        outputStream3.write(compCert.getBytes());
        outputStream3.flush();
        outputStream3.close();



        Long teacherId = teacherService.getTeacherId(teacherName);
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        teacher.setTeacherId(teacherId);

        compService.saveSingleCompInfo(teacherId, compName, compPhoto.getOriginalFilename(), compCert.getOriginalFilename(), guideCert.getOriginalFilename());
        model.addAttribute("teacher", teacher);
        return "forward:/teacher/index";
    }

    /**
     * 2019/12/27 12:51
     * 更新比赛信息的具体逻辑 当教师参与的比赛状态未提交,跳转到这里.
     * 先根据比赛id和教师id删除info,然后再跳转到更新比赛页面进行添加.
     */
    @RequestMapping("/teacher/comp/update")
    public String teacherUpdateCompInfo(String compName, Long teacherId, Model model) {
        compService.deletInfoByteacherIdCompName(compName, teacherId);
        String teacherName = teacherService.getTeacherName(teacherId);
        model.addAttribute("compName", compName);
        model.addAttribute("teacherName", teacherName);
        return "teacher/Comp/teacher_updateCompInfo";
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
        Teacher teacher = teacherService.getTeacherByTeacherId(teacherId);
        model.addAttribute("teacherName", teacher.getTeacherName());
        model.addAttribute("compCert", compInfo.getCompCert());
        model.addAttribute("compPhoto", compInfo.getCompPhoto());
        model.addAttribute("guidecert", compInfo.getGuideCert());


        return "teacher/Comp/teacher_showCompInfo";
    }

}
