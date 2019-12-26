package com.zhanghao.finalHomework.controller.adminController;

import com.zhanghao.finalHomework.model.Admin;
import com.zhanghao.finalHomework.service.AdminService;
import com.zhanghao.finalHomework.utils.CommonQueryBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/21 16:24
 * @Description：
 */
@Controller
public class AdminManagementViews {
    @Autowired
    private AdminService adminService;

    /**
     * 2019/12/21 16:26
     * 添加管理员
     */
    @RequestMapping("/admin/addAdmin")
    public String adminAdd() {
        return "admin/AdminManagement/admin_addAdmin";
    }

    /**
     * 2019/12/25 18:12
     * 添加管理员的具体逻辑
     */
    @RequestMapping("/admin/addAdmin1")
    public String adminAdd(Admin admin) {
        int result = adminService.insertAdmin(admin);
        if (result == 1) {
            return "redirect:showAdmin";
        } else {
            return "admin/AdminManagement/admin_addAdmin_fail";
        }

    }

    /**
     * 2019/12/21 16:26
     * 修改管理员密码
     */
    @RequestMapping("/admin/updateAdmin")
    public String adminUpdate(Long adminId, Model model) {
        System.out.println(adminId);
        System.out.println(adminService.getAdminName(Long.valueOf(1)));
        model.addAttribute("name", adminService.getAdminName(adminId));
        return "admin/AdminManagement/admin_updateAdmin";
    }


    /**
     * 2019/12/25 19:19
     * 修改管理员密码的具体逻辑
     */
    @RequestMapping("/admin/updateAdmin1")
    public String adminUpdate1(Admin admin, Model model) {
        adminService.updateAdmin(admin);
        return "redirect:showAdmin";
    }

    /**
     * 2019/12/25 19:00
     * 删除某位管理员
     */
    @RequestMapping("/admin/deletAdmin")
    public String adminDelet(Long adminId) {
        System.out.println(adminId);
        adminService.deletAdmin(adminId);
        return "redirect:showAdmin";
    }

    /**
     * 2019/12/21 16:34
     * 展示全部管理员
     */
    @RequestMapping("/admin/showAdmin")
    public String adminShow(@RequestParam(value = "name", defaultValue = "") String name, Model model,
                            @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3") int pageSize) {

        Admin record = new Admin();
        if (StringUtils.isNotEmpty(name)) {
            record.setAdminName(name);
            model.addAttribute("name", name);
        }
        // 计算总数量
        long total = adminService.count(record);
        // 计算总页数
        int totalPageNum = (int) total / pageSize;
        if (total % pageSize > 0) {
            totalPageNum++;
        }
        // 分页相关参数
        CommonQueryBean query = new CommonQueryBean();
        query.setPageSize(pageSize);
        query.setPageNum(pageNum);
        query.setStart((pageNum - 1) * pageSize);
        List<Admin> admins = adminService.listAllAdmins(record, query);
        model.addAttribute("total", total);
        model.addAttribute("totalPage", totalPageNum);
        model.addAttribute("admins", admins);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageNum", pageNum);

        return "admin/AdminManagement/admin_showAdmin";
    }

}
