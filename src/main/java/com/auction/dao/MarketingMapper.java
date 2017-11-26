package com.auction.dao;

import com.auction.domain.Marketing;

public interface MarketingMapper {
    int deleteByPrimaryKey(Integer marketId);

    int insert(Marketing record);

    int insertSelective(Marketing record);

    Marketing selectByPrimaryKey(Integer marketId);

    Marketing selectByStartTime(Long startTime);

    int updateByPrimaryKeySelective(Marketing record);

    int updateByPrimaryKey(Marketing record);
}