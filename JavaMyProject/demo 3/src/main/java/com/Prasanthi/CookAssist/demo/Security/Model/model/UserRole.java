package com.Prasanthi.CookAssist.demo.Security.Model.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum UserRole { ADMIN(new SimpleGrantedAuthority("ROLE_ADMIN")),
    USER(new SimpleGrantedAuthority("ROLE_USER"));

    private SimpleGrantedAuthority simpleGrantedAuthority;

    UserRole(SimpleGrantedAuthority simpleGrantedAuthority) {
        this.simpleGrantedAuthority = simpleGrantedAuthority;
    }

    public SimpleGrantedAuthority getSimpleGrantedAuthority() {
        return simpleGrantedAuthority;
    }
}

