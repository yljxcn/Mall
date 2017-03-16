
package com.xmg.mall.user.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class User
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected String avatar;
    protected String username;
    protected String phoneNumber;
    protected String email;
    protected String password;

    public String getAvatar() {
        return this.avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

}
