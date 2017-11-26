package com.auction.dao;

import com.auction.domain.AuctionTimeLinePic;

import java.util.List;

public interface AuctionTimeLinePicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuctionTimeLinePic record);

    int insertSelective(AuctionTimeLinePic record);

    AuctionTimeLinePic selectByPrimaryKey(Integer id);

    List<AuctionTimeLinePic> selectByTimeLineId(Integer id);

    int updateByPrimaryKeySelective(AuctionTimeLinePic record);

    int updateByPrimaryKey(AuctionTimeLinePic record);
}