package com.auction.vo;

import com.auction.domain.AuctionTimeLinePic;

import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
public class AuctionTimeLineVO {
    private Integer id;
    private String userId;
    private String userNickname;
    private String lineContent;
    private String createTime;
    private String updateTime;
    private List<AuctionTimeLinePic> timeLinePics;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getLineContent() {
        return lineContent;
    }

    public void setLineContent(String lineContent) {
        this.lineContent = lineContent;
    }

    public List<AuctionTimeLinePic> getTimeLinePics() {
        return timeLinePics;
    }

    public void setTimeLinePics(List<AuctionTimeLinePic> timeLinePics) {
        this.timeLinePics = timeLinePics;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
