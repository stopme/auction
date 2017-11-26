package com.auction.dao;

import com.auction.domain.MarketingGood;

public interface MarketingGoodMapper {
    int deleteByPrimaryKey(Integer mgId);

    int insert(MarketingGood record);

    int insertSelective(MarketingGood record);

    MarketingGood selectByPrimaryKey(Integer mgId);

    int updateByPrimaryKeySelective(MarketingGood record);

    int updateByPrimaryKey(MarketingGood record);
}