package com.auction.dao;

import com.auction.domain.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {
    int deleteByPrimaryKey(Integer bannerId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer bannerId);

    List<Banner> selectByPageIndex(Integer pageIndex);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}