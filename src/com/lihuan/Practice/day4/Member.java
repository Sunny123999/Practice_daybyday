package com.lihuan.Practice.day4;

public class Member {
    // 用户类
    private String username;    // 用户名
    private String password;    // 密码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        // 输出用户信息
        return "用户名：" + username + "\n密码：" + password;
    }
}