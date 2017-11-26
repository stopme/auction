package com.auction.service;

import com.auction.dao.BannerMapper;
import com.auction.dao.ConfigMapper;
import com.auction.domain.Banner;
import com.auction.domain.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    BannerMapper bannerMapper;

    public List<Banner> getBannerByPageIndex(Integer pageIndex) {
        return bannerMapper.selectByPageIndex(pageIndex);
    }

}