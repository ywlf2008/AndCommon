package com.yw.andcommon.data.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Goods {

    private String id;

    @Generated(hash = 502570248)
    public Goods(String id) {
        this.id = id;
    }

    @Generated(hash = 1770709345)
    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
