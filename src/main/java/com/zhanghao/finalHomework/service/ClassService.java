package com.zhanghao.finalHomework.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/12/23 19:06
 * @Description： 跟比赛类别相关的逻辑
 */
@Service
public interface ClassService {

    /**
     * 2019/12/23 19:07
     * 根据比赛Id 获得比赛的类别信息.
     */
    List<Class> getCompClass(Long compId);

    /**
     * 2019/12/23 21:45
     * 添加比赛类别
     */
    int insertClass(String category, String grade, BigDecimal base, BigDecimal factor);

    /** 2019/12/23 21:47
     * 删除比赛类别
    */
    int deletClass(Long classId);

    /** 2019/12/23 21:48
     * 修改类别参数
    */
    int updateClassCanshu(Long classId);
}
