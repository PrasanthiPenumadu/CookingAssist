package com.Prasanthi.CookAssist.demo.Security.Model;

import com.Prasanthi.CookAssist.demo.Security.Model.model.User;

import java.util.List;

public class Login { private List<User> userRoles;

    public Login() {
    }

    public Login(List<User> userRoles) {
        this.userRoles = userRoles;
    }

    public List<User> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<User> userRoles) {
        this.userRoles = userRoles;
    }
}