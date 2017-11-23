package com.auction.domain;

import java.util.Date;

public class Order {
    private Integer id;

    private String openId;

    private Integer campusId;

    private Long foodId;

    private Integer amount;

    private Date createTime;

    private Date consumeTime;

    private Short payState;

    private Float consume;

    private Short used;

    private Short useType;

    private Short settle;

    private Short settleStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Short getPayState() {
        return payState;
    }

    public void setPayState(Short payState) {
        this.payState = payState;
    }

    public Float getConsume() {
        return consume;
    }

    public void setConsume(Float consume) {
        this.consume = consume;
    }

    public Short getUsed() {
        return used;
    }

    public void setUsed(Short used) {
        this.used = used;
    }

    public Short getUseType() {
        return useType;
    }

    public void setUseType(Short useType) {
        this.useType = useType;
    }

    public Short getSettle() {
        return settle;
    }

    public void setSettle(Short settle) {
        this.settle = settle;
    }

    public Short getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Short settleStatus) {
        this.settleStatus = settleStatus;
    }
}