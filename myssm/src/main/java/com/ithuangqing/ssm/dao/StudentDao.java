package com.ithuangqing.ssm.dao;

import com.ithuangqing.ssm.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    /**
     * 通过学号查找学生
     * studentid
     */
    Student queryById(@Param("id") Integer id);

}
