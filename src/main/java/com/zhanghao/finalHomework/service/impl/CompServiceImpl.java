package com.zhanghao.finalHomework.service.impl;

import com.zhanghao.finalHomework.dao.*;
import com.zhanghao.finalHomework.model.Class;
import com.zhanghao.finalHomework.model.*;
import com.zhanghao.finalHomework.service.ClassService;
import com.zhanghao.finalHomework.service.CompService;
import com.zhanghao.finalHomework.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ZhangHao
 * @date 2019/12/25 13:33
 * @Description： 跟比赛有关的所有服务, 这里的比赛应该是通俗的比赛, 而不是comp表.
 */
@Service
public class CompServiceImpl implements CompService, ClassService, StuService {

    @Autowired
    private ClassDao classDao;

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private CompInfoDao compInfoDao;

    @Autowired
    private CompDao compDao;

    @Autowired
    private StuDao stuDao;

    @Autowired
    private CompInfoStuDao compInfoStuDao;


    /** 2019/12/27 16:29
     * 管理员删除比赛的逻辑
    */




    /**
     * 2019/12/25 13:50
     * 罗列单个老师的所有比赛信息.
     * 1.从登陆页面获得老师的姓名
     * 2.获得老师的id 获得对应的List<CompInfo> 以此获得比赛时间.
     * 3.查Info表中和teacherid满足条件的compid
     * 4.再查Comp表得到比赛名称,和classid
     * 5.查Class表,得到和Classid对应的那个类别和等级.
     */

    @Override
    public List<SingleTeacherAllCompInfo> listSingleTeacherAllComp(String teacherName) {
        /** 2019/12/25 22:07
         * 得到teacherId
         * 查比赛名称,查 比赛类别和项目,查,
         *
         *         model.addAttribute("teacher", teacher);
         *         List<Comp> comps = compService.listSingleTeacherAllComp(teacher.getTeacherName());
         *         model.addAttribute("comps", comps);
         *         List<Class> classes = new ArrayList<>();
         *         for (Comp comp : comps) {
         *             Class compClass = classService.getCompClass(comp.getCompId());
         *             classes.add(compClass);
         *         }
         *         model.addAttribute("classes", classes);
         *         List<CompInfo> compInfos = compService.listSingleTeacherAllCompInfo(teacher.getTeacherName());
         *         List<CompInfo> listcompInfos = new ArrayList<>(compInfos);
         *         model.addAttribute("listcompInfos", listcompInfos);
         *         List<List<Stu>> stuss = new ArrayList<>();
         *         for (CompInfo listcompInfo : listcompInfos) {
         *             List<Stu> stus = stuService.listSingleCompAllStu(listcompInfo.getInfoId());
         *             stuss.add(stus);
         *         }
         *         model.addAttribute("stuss", stuss);
         *
         */

        List<SingleTeacherAllCompInfo> result = new ArrayList<>();
        Teacher teacher = teacherDao.selectByName(teacherName);
        List<CompInfo> compInfos = compInfoDao.selectAllByteacherId(teacher.getTeacherId());

        for (CompInfo o : compInfos) {
            SingleTeacherAllCompInfo info = new SingleTeacherAllCompInfo();

            info.setInfoId(o.getInfoId());

            String name = (compDao.selectByPrimaryKey(o.getCompId())).getCompName();
            System.out.println(name);
            info.setCompName(name);

            Class aClass = classDao.selectByPrimaryKey(compDao.selectByPrimaryKey(o.getCompId()).getClassId());
            info.setLeibie(aClass.getCategory());
            info.setXiangmu(aClass.getGrade());

            info.setCreateTime(o.getCreateTime());
            if (o.getChecked() == 1) {
                info.setChecked("已提交");
            } else {
                info.setChecked("未提交");
            }
            List<CompInfoStu> compInfoStus = compInfoStuDao.getStuIdByInfoId(o.getInfoId());
            List<Stu> stus = new ArrayList<>();
            for (CompInfoStu compInfoStu : compInfoStus) {
                Stu stu = stuDao.selectByPrimaryKey(compInfoStu.getStuId());
                stus.add(stu);
            }
            info.setStus(stus);
            result.add(info);
        }

        return result;

    }

    @Override
    public List<CompInfo> listSingleTeacherAllCompInfo(String teacherName) {
        Teacher teacher = teacherDao.selectByName(teacherName);
        return compInfoDao.selectAllByteacherId(teacher.getTeacherId());
    }

    @Override
    public List<Stu> listSingleCompAllStu(Long infoId) {

       /* 先查conpstu表,然后返回所有的stuid
                然后查sut表,返回stu*/
        List<CompInfoStu> stuIdByInfoId = compInfoStuDao.getStuIdByInfoId(infoId);
        List<Stu> stus = new ArrayList<>();
        for (CompInfoStu compInfoStu : stuIdByInfoId) {
            Stu stu = stuDao.selectByPrimaryKey(compInfoStu.getStuId());
            stus.add(stu);
        }
        return stus;
    }

    @Override
    public int insertStu(Stu stu, Long infoId) {
        /** 2019/12/26 21:17
         * 添加比赛的同时,要添加上学生和比赛的映射.
         */
        stuDao.insert(stu);
        CompInfoStu infoStu = new CompInfoStu();
        infoStu.setInfoId(infoId);
        infoStu.setStuId(stu.getStuId());
        compInfoStuDao.insert(infoStu);
        return 0;
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
    public List<NewestCompInfo> listNewestCompInfos() {
        /** 2019/12/27 14:18
         * 先根据时间排序查出来所有的info,得到比赛时间,然后查比赛老师,类别,名称,set给封装类.
         */
        List<NewestCompInfo> infos = new ArrayList<>();

        List<CompInfo> infoByNewestTime = compInfoDao.getInfoByNewestTime();

//        List<NewestCompInfo> infosCopy = new CopyOnWriteArrayList<NewestCompInfo>() {{
//            for (NewestCompInfo info  : infos) {
//                add(info);
//            }
//        }};
        for (CompInfo compInfo : infoByNewestTime) {
            NewestCompInfo infoSingle = new NewestCompInfo();
            Teacher teacher = teacherDao.selectByPrimaryKey(compInfo.getTeacherId());
//              老师
            infoSingle.setTeacherName(teacher.getTeacherName());
            Comp comp = compDao.selectByPrimaryKey(compInfo.getCompId());
//                比赛名称
            infoSingle.setCompName(comp.getCompName());
            Class aClass = classDao.selectByPrimaryKey(comp.getClassId());
//                比赛类别和项目
            infoSingle.setLeibie(aClass.getCategory());
            infoSingle.setXiangmu(aClass.getGrade());
//                比赛时间
            infoSingle.setTime(compInfo.getCreateTime());
            infos.add(infoSingle);
        }

        return infos;
    }

    @Override
    public List<CompInfo> listAllCompInfo() {
        return null;
    }

    @Override
    public int insertSingleCompInfo(Long teacherId, String compName, byte[] compPhoto, byte[] compCert, byte[] guideCert) {
        CompInfo compInfo = new CompInfo();
        compInfo.setChecked(1);
        compInfo.setTeacherId(teacherId);

        Comp compBycompName = compDao.getCompBycompName(compName);
        compInfo.setCompId(compBycompName.getCompId());
        Date date = new Date();
        compInfo.setCreateTime(date);
        compInfoDao.insert(compInfo);
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
        return compDao.getCompByclassId(classId);
    }

    @Override
    public int insertComp(Long classId, String compName) {
        Comp comp=new Comp();
        comp.setCompName(compName);
        comp.setClassId(classId);
        compDao.insert(comp);
        return 0;
    }

    @Override
    public Long getTeacherIdByinfoId(Long infoId) {
        return teacherDao.getTeacherIdByinfoId(infoId);
    }

    @Override
    public String getInfoByInfoid(Long infoId) {

        CompInfo infoByInfoid = compInfoDao.getInfoByInfoid(infoId);

        Comp comp = compDao.selectByPrimaryKey(infoByInfoid.getCompId());

        return comp.getCompName();
    }

    @Override
    public void deletCompBycompId(Long compId) {
        compDao.deleteByPrimaryKey(compId);
    }

    @Override
    public void deletCompStuInfoBystuId(Long stuId) {
        compInfoStuDao.deletBystuId(stuId);
    }

    @Override
    public List<Comp> getallCompByTeacherId(Long teacherId) {

        List<CompInfo> compInfos = compInfoDao.selectAllByteacherId(teacherId);
        List<Comp> comps = new ArrayList<>();
        for (CompInfo compInfo : compInfos) {
            Comp comp = compDao.selectByPrimaryKey(compInfo.getCompId());
            comps.add(comp);
        }
        return comps;

    }

    @Override
    public List<Comp> getTeacherNotInCompByTeacherId(Long teacherId) {

        /** 2019/12/27 9:24
         * 先从info中得到不是这个老师的 compid 然后去comp中把compname得到(逻辑大错特错!!!!)
         */
        /** 2019/12/27 9:40
         * 要先从ifno中的到时这个老师的compid(有很多个) 然后去comp中把不是这个compid的内容找出来.
         */
        List<CompInfo> compInfos = compInfoDao.selectAllByteacherId(teacherId);
        List<Comp> allComp = compDao.selectAllComp();

        List<Comp> allCompCopy = new CopyOnWriteArrayList<Comp>() {{
            for (Comp comp : allComp) {
                add(comp);
            }
        }};

        for (CompInfo compInfo : compInfos) {
            for (Comp comp : allCompCopy) {
                if (comp.getCompId().equals(compInfo.getCompId())) {
                    allCompCopy.remove(comp);
                }
            }
        }

        return allCompCopy;
    }

    @Override
    public void deletInfoByteacherIdCompName(String compName, Long teacherId) {
        /** 2019/12/27 13:06
         * 先根据compName获得compid 再根据COmpid和teacherId 获得Info
         */
        Comp comp = compDao.getCompBycompName(compName);
        CompInfo compInfo = compInfoDao.getinfoByteacherIdCompId(teacherId, comp.getCompId());
        compInfoDao.deleteByPrimaryKey(compInfo.getInfoId());

    }

    @Override
    public void saveSingleCompInfo(Long teacherId, String compName, Object o, Object o1, Object o2) {
        CompInfo compInfo = new CompInfo();
        compInfo.setChecked(0);
        compInfo.setTeacherId(teacherId);

        Comp compBycompName = compDao.getCompBycompName(compName);
        compInfo.setCompId(compBycompName.getCompId());
        Date date = new Date();
        compInfo.setCreateTime(date);
        compInfoDao.insert(compInfo);
    }

    @Override
    public Class getClassByCompName(String compName) {

        Comp comp = compDao.getCompBycompName(compName);

        return classDao.selectByPrimaryKey(comp.getClassId());
    }

    @Override
    public CompInfo getInfoByteacherIdcompName(Long teacherId, String compName) {
        Comp comp = compDao.getCompBycompName(compName);

        return compInfoDao.getinfoByteacherIdCompId(teacherId, comp.getCompId());
    }

    @Override
    public List<Stu> getStuByinfoid(Long infoId) {
        List<CompInfoStu> stuIdByInfoId = compInfoStuDao.getStuIdByInfoId(infoId);
        List<Stu> stus = new ArrayList<>();
        for (CompInfoStu infoStu : stuIdByInfoId) {
            Stu stu = stuDao.selectByPrimaryKey(infoStu.getStuId());
            stus.add(stu);
        }
        return stus;
    }

    @Override
    public Long countCompInfoNum(CompInfo compInfo) {
        return compInfoDao.count(compInfo);
    }

    @Override
    public void updateclass(Long classId,BigDecimal base, BigDecimal factor) {
        Class clazz=new Class();
        clazz.setClassId(classId);
        clazz.setBase(base);
        clazz.setFactor(factor);
        classDao.updateByPrimaryKeySelective(clazz);
    }

    @Override
    public Class getCompClass(Long compId) {
        Comp comp = compDao.selectByPrimaryKey(compId);
        Class aClass = classDao.selectByPrimaryKey(comp.getClassId());
        return aClass;
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
    public Class getClassByClassId(Long classId) {
        Class aClass = classDao.selectByPrimaryKey(classId);
        return aClass;
    }

    @Override
    public int deletStu(Long stuId) {
        return stuDao.deleteByPrimaryKey(stuId);
    }

    @Override
    public int countStuNum(Long stuId) {
        return 0;
    }

}
