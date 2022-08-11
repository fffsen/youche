package com.test.demo.entity;

/**
 * @author fengxiangsen@phone580.com
 * @since 2022/8/8
 */
public class User {
    private Integer id;

    private String name;

    private int age;

    private String createTime;

    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
