package com.edu.cn.beans;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */

/**
 * 前台传的操作人信息
 * */
public class User {
    private String userID;
    private String userName;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
