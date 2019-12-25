package com.zhanghao.finalHomework.service;

import com.zhanghao.finalHomework.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/23 15:16
 * @Description： 管理员的逻辑
 */
@Service
public interface AdminService {

    /** 2019/12/23 15:20
     * 管理员的登录
    */
    int adminLogin();

    /** 2019/12/23 18:30
     * 管理员 展示 分页查询
    */
    List<Admin> listAllAdmins();

    /** 2019/12/23 18:32
     * 管理员新增
    */
    int insertAdmin();

    /** 2019/12/23 18:33
     * 管理员删除
    */
    int deletAdmin(Long adminId);

    /** 2019/12/23 18:33
     * 管理员密码修改
    */
    int updateAdmin(Long adminId);

    /** 2019/12/23 21:56
     * 根据管理员账号查询
    */
    Admin getAdmin(Long adminId);



}
