package com.zhanghao.finalHomework.service.impl;

import com.zhanghao.finalHomework.dao.*;
import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import com.zhanghao.finalHomework.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/25 13:33
 * @Description： 跟比赛有关的所有服务,这里的比赛应该是通俗的比赛,而不是comp表.
 */
@Service
public class CompServiceImpl implements CompService,ClassService,StuService {



    @Autowired
    private ClassDao classDao;

    @Autowired
    private TeacherDao  teacherDao;

    @Autowired
    private CompInfoDao conpInfoDao;

    @Autowired
    private CompDao compDao;

    @Autowired
    private StuDao stuDao;





    /** 2019/12/25 13:50
     * 罗列单个老师的所有比赛信息.
     *  1.从登陆页面获得老师的姓名
     *  2.获得老师的id 获得对应的List<CompInfo> 以此获得比赛时间.
     *  3.查Info表中和teacherid满足条件的compid
     *  4.再查Comp表得到比赛名称,和classid
     *  5.查Class表,得到和Classid对应的那个类别和等级.
    */




    @Override
    public List<CompInfo> listSingleTeacherAllCompInfo(Long teacherId) {
        /** 2019/12/25 22:07
         *
         * 得到teacherId
         * 查比赛名称,查 比赛类别和项目,查,
        */
       Teacher teacher=teacherDao.selectByPrimaryKey(teacherId);

        return null;
    }

    @Override
    public List<Comp> listSingleTeacherComp(String compName) {
        return null;
    }

    @Override
    public Comp getComp(Long compId) {
        return null;
    }

    @Override
    public List<Comp> listNewestCompInfos() {
        return null;
    }

    @Override
    public List<CompInfo> listAllCompInfo() {
        return null;
    }

    @Override
    public int insertSingleCompInfo(Long teacherId, String compName, byte[] compPhoto, byte[] compCert, byte[] guideCert) {
        return 0;
    }

    @Override
    public int updateSingleCompInfo(Long teacherId, String compName, byte[] compPhoto, byte[] compCert, byte[] guideCert) {
        return 0;
    }

    @Override
    public List<Comp> listAllCompInfo(String compName) {
        return null;
    }

    @Override
    public List<CompInfo> listAllCompInfo(Long teacherId) {
        return null;
    }

    @Override
    public List<Comp> listAllComp(Long classId) {
        return null;
    }

    @Override
    public int insertComp(Long classId, String compName) {
        return 0;
    }

    @Override
    public List<Class> getCompClass(Long compId) {
        return null;
    }

    @Override
    public int insertClass(Class record) {
        /** 2019/12/25 14:58
         * 添加比赛类别:
         * 将信息加进表中 这是最简单的.
        */
       return classDao.insert(record);
    }

    @Override
    public int deletClass(Long classId) {

        /** 2019/12/25 20:47
         * 删除类别 直接删!
        */

        return classDao.deleteByPrimaryKey(classId);
    }

    @Override
    public int updateClassCanshu(Long classId) {
        return 0;
    }

    @Override
    public List<Class> getAllClass() {
        /** 2019/12/25 20:30
         * 直接查!
        */
        return classDao.list();
    }

    @Override
    public List<Stu> listSingleCompAllStu(Long compId) {
        return null;
    }

    @Override
    public int insertStu(Long infoId, Long stuId, String stuName, Long stuAge, String stuClass) {
        return 0;
    }

    @Override
    public int deletStu(Long stuId) {
        return 0;
    }

    @Override
    public int countStuNum(Long stuId) {
        return 0;
    }


}
