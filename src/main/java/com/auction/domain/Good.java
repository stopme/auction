package com.auction.domain;

import java.util.List;

public class Good {
    private Integer goodId;

    private String goodName;

    private String goodCode;

    private String goodTag;

    private Integer miaoshaPrice;

    private String goodDetail;

    private Integer goodSort;

    private Integer salePrice;

    private Byte goodUsed;

    private Byte goodStatus;

    private Long createTime;

    private Long updateTime;

    private List<GoodImage> goodImageList;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode == null ? null : goodCode.trim();
    }

    public String getGoodTag() {
        return goodTag;
    }

    public void setGoodTag(String goodTag) {
        this.goodTag = goodTag == null ? null : goodTag.trim();
    }

    public Integer getMiaoshaPrice() {
        return miaoshaPrice;
    }

    public void setMiaoshaPrice(Integer miaoshaPrice) {
        this.miaoshaPrice = miaoshaPrice;
    }

    public String getGoodDetail() {
        return goodDetail;
    }

    public void setGoodDetail(String goodDetail) {
        this.goodDetail = goodDetail == null ? null : goodDetail.trim();
    }

    public Integer getGoodSort() {
        return goodSort;
    }

    public void setGoodSort(Integer goodSort) {
        this.goodSort = goodSort;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Byte getGoodUsed() {
        return goodUsed;
    }

    public void setGoodUsed(Byte goodUsed) {
        this.goodUsed = goodUsed;
    }

    public Byte getGoodStatus() {
        return goodStatus;
    }

    public void setGoodStatus(Byte goodStatus) {
        this.goodStatus = goodStatus;
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

    public List<GoodImage> getGoodImageList() {
        return goodImageList;
    }

    public void setGoodImageList(List<GoodImage> goodImageList) {
        this.goodImageList = goodImageList;
    }
}