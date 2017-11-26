package com.auction.dao;

import com.auction.domain.AuctionUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuctionUser record);

    int insertSelective(AuctionUser record);

    AuctionUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuctionUser record);

    int updateByPrimaryKey(AuctionUser record);
}