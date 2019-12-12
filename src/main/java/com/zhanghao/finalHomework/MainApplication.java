package com.zhanghao.finalHomework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ZhangHao
 * @date 2019/12/10 20:34
 * @Description： SpringBoot的启动类
 */
@SpringBootApplication
@EnableScheduling
@MapperScan(value ="com.zhanghao.finalHomework.dao")
public class MainApplication {
    public static void main(String[] args){
        SpringApplication.run(MainApplication.class, args);
    }
}