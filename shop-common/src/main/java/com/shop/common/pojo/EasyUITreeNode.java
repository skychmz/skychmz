package com.shop.common.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ed on 2017/8/16.
 */
public class EasyUITreeNode {
     private long id;
     private String text;
     private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
