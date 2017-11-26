package com.auction.service;

import com.alibaba.fastjson.JSON;
import com.auction.dao.MarketingGoodMapper;
import com.auction.dao.MarketingMapper;
import com.auction.domain.Good;
import com.auction.domain.Marketing;
import com.auction.domain.MarketingGood;
import com.auction.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by 李枝 on 2017/11/25.
 */
@Service
public class MarketService {
    public static Logger logger = LoggerFactory.getLogger(MarketService.class);
    @Autowired
    MarketingMapper marketingMapper;
    @Autowired
    GoodService goodService;

    @Autowired
    MarketingGoodMapper marketingGoodMapper;

    public int createMarket(Date aDate,int hour,String type){
        Date zhenDian = DateUtil.getHourClock(aDate,hour);
        String name = DateUtil.convert2String(zhenDian, "yyyy-MM-dd HH:mm:ss 开始竞拍");
        long currentTime = System.currentTimeMillis();
        long startTime = DateUtil.getHourClockSecond(zhenDian); //开始时间以秒结束
        Marketing marketing = new Marketing();
        marketing.setMarketName(name);
        marketing.setMarketType(type);
        marketing.setStartTime(startTime);
        marketing.setCreateTime(currentTime);
        logger.info("market data {}", JSON.toJSON(marketing));
        return marketingMapper.insertSelective(marketing);
    }

    public Marketing getMarketingWithByStartTime(Date aDate){
        long startTime  = DateUtil.getHourClockSecond(aDate);
        Marketing marketing = marketingMapper.selectByStartTime(startTime);
        if(marketing != null){
            List<Good> goodList = goodService.getGoodListWithByMarketingId(marketing.getMarketId());
            marketing.setGoodList(goodList);
        }
        return marketing;
    }

    public Marketing getOnlyMarketingByStartTime(Date aDate){
        long startTime  = DateUtil.getHourClockSecond(aDate);
        return marketingMapper.selectByStartTime(startTime);
    }
    public Marketing getOnlyMarketingById(int marketId){
        return marketingMapper.selectByPrimaryKey(marketId);
    }

    //通过good和market 联系在一起
    public void createMarketGood(List<Good>goodList,Marketing marketing){
        if(!CollectionUtils.isEmpty(goodList)){
            MarketingGood marketingGood = null;
            for(Good good : goodList){
                marketingGood = new MarketingGood();
                marketingGood.setMarketId(marketing.getMarketId());
                marketingGood.setGoodId(good.getGoodId());
                marketingGood.setGoodCode(good.getGoodCode());
                marketingGood.setMarketName(marketing.getMarketName());
                marketingGood.setPerJinbgpaiPrice(100);
                marketingGood.setStartJinbgpaiPrice(0);
                marketingGood.setCreateTime(System.currentTimeMillis());
                marketingGoodMapper.insertSelective(marketingGood);
            }
        }
    }
}
