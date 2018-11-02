package com.ithuangqing.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * 在AOP中这个UserDao可以被成为目标对象
 * 其中的每一个方法都可以叫做是一个连接点
 * 而只有真正被增强的那个方法才叫做是切入点
 */

public class UserDao {

    public void save() {
        System.out.println("save方法被执行了");
    }

    public void find() {

    }

    public void update() {

    }

    public void delete() {

    }


}
