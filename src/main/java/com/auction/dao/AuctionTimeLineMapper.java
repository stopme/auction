package com.auction.dao;

import com.auction.domain.AuctionTimeLine;

import java.util.List;

public interface AuctionTimeLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuctionTimeLine record);

    int insertSelective(AuctionTimeLine record);

    AuctionTimeLine selectByPrimaryKey(Integer id);

    List<AuctionTimeLine> selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(AuctionTimeLine record);

    int updateByPrimaryKey(AuctionTimeLine record);
}