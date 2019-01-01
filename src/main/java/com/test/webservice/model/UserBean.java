package com.test.webservice.model;

import java.io.Serializable;

public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public UserBean() {
        super();
    }

    public UserBean(String name) {
        super();
        this.name = name;
    }

    public int getId() {
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

    @Override
    public String toString() {
        return "UserBean [id=" + id + ", username=" + name + "]";
    }
}
