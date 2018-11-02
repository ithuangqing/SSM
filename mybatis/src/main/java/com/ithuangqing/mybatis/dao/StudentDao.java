package com.ithuangqing.mybatis.dao;


import com.ithuangqing.mybatis.vo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    /**
     * 通过学号查找学生
     * studentid
     */
    Student queryById(Integer id);

}
