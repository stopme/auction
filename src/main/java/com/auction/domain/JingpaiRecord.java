package com.auction.domain;

public class JingpaiRecord {
    private Integer jingpaiId;

    private Integer marketId;

    private Integer userId;

    private Integer goodId;

    private Integer userName;

    private Integer jingpaiPrice;

    private Byte jingpaiStatus;

    private Long jingpaiTime;

    private Long createTime;

    private Long updateTime;

    public Integer getJingpaiId() {
        return jingpaiId;
    }

    public void setJingpaiId(Integer jingpaiId) {
        this.jingpaiId = jingpaiId;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getJingpaiPrice() {
        return jingpaiPrice;
    }

    public void setJingpaiPrice(Integer jingpaiPrice) {
        this.jingpaiPrice = jingpaiPrice;
    }

    public Byte getJingpaiStatus() {
        return jingpaiStatus;
    }

    public void setJingpaiStatus(Byte jingpaiStatus) {
        this.jingpaiStatus = jingpaiStatus;
    }

    public Long getJingpaiTime() {
        return jingpaiTime;
    }

    public void setJingpaiTime(Long jingpaiTime) {
        this.jingpaiTime = jingpaiTime;
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
}