package com.auction.constant;

/**
 * Created by Administrator on 2017/11/26.
 */
public enum TagType {
    TIMELINE("dongtai"),ARTICLE("zhishi");
    String type;
    TagType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
