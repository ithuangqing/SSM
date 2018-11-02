package com.ithuangqing.spring.pojo;

import org.springframework.stereotype.Repository;

/**
 * 实体类
 * pojo
 * @author ithuangqing
 */

@Repository(value = "user")
public class User {

    private String  name;

    private String  sex;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
