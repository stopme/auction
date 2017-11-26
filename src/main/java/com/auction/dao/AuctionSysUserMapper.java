package com.auction.dao;

import com.auction.domain.AuctionSysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionSysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuctionSysUser record);

    int insertSelective(AuctionSysUser record);

    AuctionSysUser selectByPrimaryKey(Integer id);

    AuctionSysUser selectSupAdmin();

    int updateByPrimaryKeySelective(AuctionSysUser record);

    int updateByPrimaryKey(AuctionSysUser record);
}