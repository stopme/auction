package com.auction.dao;

import com.auction.domain.JingpaiFail;

public interface JingpaiFailMapper {
    int deleteByPrimaryKey(Integer jingpaiId);

    int insert(JingpaiFail record);

    int insertSelective(JingpaiFail record);

    JingpaiFail selectByPrimaryKey(Integer jingpaiId);

    int updateByPrimaryKeySelective(JingpaiFail record);

    int updateByPrimaryKey(JingpaiFail record);
}