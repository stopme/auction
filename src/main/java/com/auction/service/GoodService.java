package com.auction.service;

import com.alibaba.fastjson.JSON;
import com.auction.dao.GoodImageMapper;
import com.auction.dao.GoodMapper;
import com.auction.dao.MarketingMapper;
import com.auction.domain.Good;
import com.auction.domain.Marketing;
import com.auction.util.DateUtil;
import com.auction.util.Pager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by 李枝 on 2017/11/25.
 */
@Service
public class GoodService {
    public static Logger logger = LoggerFactory.getLogger(GoodService.class);
    @Autowired
    GoodMapper goodMapper;
    @Autowired
    GoodImageService goodImageService;

    @Transactional
    public int createGood(Good good){
        int goodId = goodMapper.insertSelective(good);
        goodImageService.createGoodImages(good.getGoodImageList(), good.getGoodId());
        return goodId;
    }

    public List<Good> getGoodListOnlyByMarketingId(int marketingId){
        List<Good> goodList = goodMapper.getGoodListByMarketingId(marketingId);
        return goodList;
    }
    public List<Good> getGoodListWithByMarketingId(int marketingId){
        List<Good> goodList = goodMapper.getGoodListByMarketingId(marketingId);
        for(Good good: goodList){
            good.setGoodImageList(goodImageService.getGoodImages(good.getGoodId()));
        }
        return goodList;
    }

    public Pager<Good> getAllGoods(Pager<Good> goodPager){

        goodPager.setRecordTotal(goodMapper.getGoodCount());
        System.out.println();
        List<Good> goodList = goodMapper.getAllGoods(goodPager);
        System.out.println(JSON.toJSON(goodList));
        for(Good good: goodList){
            good.setGoodImageList(goodImageService.getGoodImages(good.getGoodId()));
        }
        goodPager.setContent(goodList);
        return goodPager;
    }



}
