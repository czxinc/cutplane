package com.edu.cn.beans;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
public class Student {
    private String studentID;
    private String name;
    private int age;

    // 这里是前台传的 用户信息
    User user;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
