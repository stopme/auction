package com.auction.constant;

/**
 * Created by Administrator on 2017/11/26.
 */
public enum UserRemark {

    NORMAL(0,"正常用户"),ZOMBIE(1,"僵尸用户"),ADMIN(2,"系统用户");
    int code;
    String desc;
    UserRemark(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
    UserRemark findRemark(int code){
        UserRemark[] remarks = values();
        for (UserRemark remark : remarks ){
            if(remark.code == code){
                return remark;
            }
        }
        return NORMAL;
    }
    public int getCode(){
        return this.code;
    }
    public String getDesc(){
        return this.desc;
    }
}
