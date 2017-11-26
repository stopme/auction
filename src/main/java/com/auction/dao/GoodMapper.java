package com.auction.dao;

import com.auction.domain.Good;
import com.auction.util.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodMapper {
    int deleteByPrimaryKey(Integer goodId);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer goodId);

    List<Good> getGoodListByMarketingId(Integer marketingId);

    List<Good> getAllGoods(Pager<Good> goodPager);

    int getGoodCount();

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}