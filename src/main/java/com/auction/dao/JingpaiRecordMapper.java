package com.auction.dao;

import com.auction.domain.JingpaiRecord;

public interface JingpaiRecordMapper {
    int deleteByPrimaryKey(Integer jingpaiId);

    int insert(JingpaiRecord record);

    int insertSelective(JingpaiRecord record);

    JingpaiRecord selectByPrimaryKey(Integer jingpaiId);

    int updateByPrimaryKeySelective(JingpaiRecord record);

    int updateByPrimaryKey(JingpaiRecord record);
}