package com.example.chm.ofowebsql.bean;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;
import shem.com.materiallogin.DefaultRegisterView;

/**
 * Created by asus1 on 2016/12/17.
 */

public class user extends BmobUser {
    String username;
    String userpwd;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }



}
