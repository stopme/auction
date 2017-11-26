package com.auction.domain;

public class GoodRecord {
    private Integer recordId;

    private Integer goodId;

    private Integer watchTime;

    private Integer jingpaiTime;

    private Long createTime;

    private Long updateTime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(Integer watchTime) {
        this.watchTime = watchTime;
    }

    public Integer getJingpaiTime() {
        return jingpaiTime;
    }

    public void setJingpaiTime(Integer jingpaiTime) {
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