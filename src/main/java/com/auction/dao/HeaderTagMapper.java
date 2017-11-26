package com.auction.dao;

import com.auction.domain.HeaderTag;

import java.util.List;

public interface HeaderTagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(HeaderTag record);

    int insertSelective(HeaderTag record);

    HeaderTag selectByPrimaryKey(Integer tagId);

    List<HeaderTag> selectAllUsedTag();

    int updateByPrimaryKeySelective(HeaderTag record);

    int updateByPrimaryKey(HeaderTag record);
}