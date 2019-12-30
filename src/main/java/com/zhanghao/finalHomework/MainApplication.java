package com.zhanghao.finalHomework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.MultipartConfigElement;

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

    /**
     * @Description:    配置上传文件大小的配置
     * @Author:         vdi100
     * @CreateDate:     2019/4/24 15:57
     * @Version:        1.0
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个数据大小
        factory.setMaxFileSize("1024000KB");
        // 总上传数据大小
        factory.setMaxRequestSize("1024000KB");
        return factory.createMultipartConfig();
    }
}