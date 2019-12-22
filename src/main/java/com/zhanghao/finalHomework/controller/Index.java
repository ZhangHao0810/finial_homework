package com.zhanghao.finalHomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangHao
 * @date 2019/12/20 16:00
 * @Description： 首页的控制层
 */
@Controller
public class Index {

    @RequestMapping("/index")
    public String testBootStrap(){
        return "index";
    }

}
