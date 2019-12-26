package com.zhanghao.finalHomework.service.impl;

import com.zhanghao.finalHomework.dao.AdminDao;
import com.zhanghao.finalHomework.model.Admin;
import com.zhanghao.finalHomework.service.AdminService;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/25 13:49
 * @Description： 与管理员相关的service实现
 */
@Service
public class AdminImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public int adminLogin(String name,String password) {
        /** 2019/12/25 14:03
         * 管理员登录:
         * 根据姓名和密码查找,找到了 返回1,找不到 返回0
        */
       Admin result= adminDao.selectByAdminNamePassword(name, password);
       if (result!=null){
           return 1;
       }
        return 0;
    }


    @Override
    public List<Admin> listAllAdmins(Admin record, CommonQueryBean query) {
        /** 2019/12/25 15:29
         * 管理员管理
         * 分页查询出来全部的管理员信息,每页5个
        */
        return adminDao.list4Page(record,query);
    }

    @Override
    public int insertAdmin(Admin admin) {
        /** 2019/12/25 18:05
         * 添加管理员
         * 1.判断管理员是否重复.
         * 2.重复添加失败 0 ,不重复添加成功.1
        */
       Admin result= adminDao.selectByName(admin.getAdminName());
       if (result!=null){
           return 0;
       }else {
           adminDao.insert(admin);
           return 1;
       }
    }

    @Override
    public int deletAdmin(Long adminId) {
        /** 2019/12/25 18:57
         * 匹配到管理员的id,然后删除
        */
        adminDao.deleteByPrimaryKey(adminId);
        return 0;
    }

    @Override
    public int updateAdmin(Admin admin) {
        adminDao.updateByPrimaryKeySelective(admin);
        return 0;
    }

    @Override
    public String getAdminName(Long adminId) {
       return adminDao.getNameById(adminId);

    }

    @Override
    public Admin getAdmin(Long adminId) {
        return null;
    }

    @Override
    public long count(Admin admin) {
        return adminDao.count(admin);
    }
}
