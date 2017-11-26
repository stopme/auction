package com.auction.dao;

import com.auction.domain.JingpaiSucc;

public interface JingpaiSuccMapper {
    int deleteByPrimaryKey(Integer jingpaiId);

    int insert(JingpaiSucc record);

    int insertSelective(JingpaiSucc record);

    JingpaiSucc selectByPrimaryKey(Integer jingpaiId);

    int updateByPrimaryKeySelective(JingpaiSucc record);

    int updateByPrimaryKey(JingpaiSucc record);
}