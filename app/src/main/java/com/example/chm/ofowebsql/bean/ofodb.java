package com.example.chm.ofowebsql.bean;


import cn.bmob.v3.BmobObject;

/**
 * Created by asus1 on 2016/12/16.
 */

public class ofodb extends BmobObject {
    String ofoid;
    String  ofoidpwd;

    public String getOfoid() {
        return ofoid;
    }

    public void setOfoid(String ofoid) {
        this.ofoid = ofoid;
    }

    public String getOfoidpwd() {
        return ofoidpwd;
    }

    public void setOfoidpwd(String ofoidpwd) {
        this.ofoidpwd = ofoidpwd;
    }
}
