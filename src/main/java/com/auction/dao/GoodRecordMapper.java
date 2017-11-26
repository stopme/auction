package com.auction.dao;

import com.auction.domain.GoodRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GoodRecord record);

    int insertSelective(GoodRecord record);

    GoodRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GoodRecord record);

    int updateByPrimaryKey(GoodRecord record);
}