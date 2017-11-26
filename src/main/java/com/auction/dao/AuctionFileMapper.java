package com.auction.dao;

import com.auction.domain.AuctionFile;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionFileMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(AuctionFile record);

    int insertSelective(AuctionFile record);

    AuctionFile selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(AuctionFile record);

    int updateByPrimaryKey(AuctionFile record);
}