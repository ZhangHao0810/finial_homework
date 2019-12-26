package com.zhanghao.finalHomework.service;

import com.zhanghao.finalHomework.model.Admin;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.ibatis.annotations.Param;
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
    int adminLogin(String name,String password);

    /** 2019/12/23 18:30
     * 管理员 展示 分页查询
    */
    List<Admin> listAllAdmins (@Param("record")Admin record, @Param("commonQueryParam")CommonQueryBean query);

    /** 2019/12/23 18:32
     * 管理员新增
    */
    int insertAdmin(Admin admin);

    /** 2019/12/23 18:33
     * 管理员删除
    */
    int deletAdmin(Long adminId);

    /** 2019/12/23 18:33
     * 管理员修改
    */
    int updateAdmin(Admin admin);

    /** 2019/12/25 19:52
     * 获得管理员姓名
    */
    String getAdminName(Long adminId);

    /** 2019/12/23 21:56
     * 根据管理员账号查询
    */
    Admin getAdmin(Long adminId);

    /** 2019/12/25 15:38
     *
     * 查询管理员的数量
    */
    long count(Admin admin);




}
