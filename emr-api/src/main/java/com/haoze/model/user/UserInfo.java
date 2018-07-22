package com.haoze.model.user;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/22.
 */
public class UserInfo implements Serializable{

    private String id;
    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
