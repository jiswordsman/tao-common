package com.jiyongjun.tao.common.model;

import lombok.ToString;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/2 17:40
 */
@ToString
public class User {
    private String username;
    private String password;
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
