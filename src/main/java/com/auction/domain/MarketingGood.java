package com.auction.domain;

public class MarketingGood {
    private Integer mgId;

    private Integer marketId;

    private Integer goodId;

    private String marketName;

    private String goodCode;

    private Integer startJinbgpaiPrice;

    private Integer perJinbgpaiPrice;

    private Integer miaoshaPrice;

    private Long createTime;

    private Long updateTime;

    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode == null ? null : goodCode.trim();
    }

    public Integer getStartJinbgpaiPrice() {
        return startJinbgpaiPrice;
    }

    public void setStartJinbgpaiPrice(Integer startJinbgpaiPrice) {
        this.startJinbgpaiPrice = startJinbgpaiPrice;
    }

    public Integer getPerJinbgpaiPrice() {
        return perJinbgpaiPrice;
    }

    public void setPerJinbgpaiPrice(Integer perJinbgpaiPrice) {
        this.perJinbgpaiPrice = perJinbgpaiPrice;
    }

    public Integer getMiaoshaPrice() {
        return miaoshaPrice;
    }

    public void setMiaoshaPrice(Integer miaoshaPrice) {
        this.miaoshaPrice = miaoshaPrice;
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