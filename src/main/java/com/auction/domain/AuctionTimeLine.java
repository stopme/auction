package com.auction.domain;

import java.util.List;

public class AuctionTimeLine {
    private Integer id;

    private Integer userId;

    private String userNickname;

    private String lineContent;

    private Long createTime;

    private Long updateTime;

    List<AuctionTimeLinePic> pics ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getLineContent() {
        return lineContent;
    }

    public void setLineContent(String lineContent) {
        this.lineContent = lineContent == null ? null : lineContent.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<AuctionTimeLinePic> getPics() {
        return pics;
    }

    public void setPics(List<AuctionTimeLinePic> pics) {
        this.pics = pics;
    }
}