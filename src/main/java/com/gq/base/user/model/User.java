package com.gq.base.user.model;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by ZSL on 2017/7/14.
 */
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
