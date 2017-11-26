package com.auction.dao;

import com.auction.domain.GoodImage;

import java.util.List;

public interface GoodImageMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(GoodImage record);

    int insertSelective(GoodImage record);

    GoodImage selectByPrimaryKey(Integer imageId);

    List<GoodImage> getGoodImagesByGoodId(Integer goodId);

    int updateByPrimaryKeySelective(GoodImage record);

    int updateByPrimaryKey(GoodImage record);
}