package com.jtest.service;

import com.alibaba.fastjson.JSON;
import com.auction.domain.Good;
import com.auction.domain.Marketing;
import com.auction.service.GoodService;
import com.auction.service.MarketService;
import com.auction.util.DateUtil;
import com.auction.util.Pager;
import com.jtest.BaseJunit4Test;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

/**
 * Created by 李枝 on 2017/11/25.
 */
public class MarketServiceTest extends BaseJunit4Test {


    @Autowired
    MarketService marketService;

    @Autowired
    GoodService goodService;

    @Test
    public void testCreateMarket(){

        Date date = new Date();
        for (int i=0;i<2;i++){
            Assert.assertTrue(marketService.createMarket(DateUtil.getSomeDay(date, i), 11, "jingpai") > 0);
            Assert.assertTrue(marketService.createMarket(DateUtil.getSomeDay(date, i), 17, "jingpai") > 0);
            Assert.assertTrue(marketService.createMarket(DateUtil.getSomeDay(date, i), 20, "jingpai") > 0);
        }
    }

    @Test
    public void testGetMarket(){
        Date date = new Date();
        System.out.println(JSON.toJSON(marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date, 11))));
        System.out.println(JSON.toJSON(marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date, 17))));
        System.out.println(JSON.toJSON(marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date, 20))));
        System.out.println(JSON.toJSON(marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date, 21))));
    }


    @Test
    public void testCreateMarketWithGood(){
        Pager<Good> pager = new Pager<Good>();
        pager.setPageSize(20);
        pager = goodService.getAllGoods(pager);
        System.out.println(JSON.toJSON(pager));
        Date date = new Date();
        Marketing marketing11 = marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date,11));
        Marketing marketing17 = marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date,17));
        Marketing marketing20 = marketService.getOnlyMarketingByStartTime(DateUtil.getHourClock(date,20));
        System.out.println(JSON.toJSON(marketing11));
        System.out.println(JSON.toJSON(marketing17));
        System.out.println(JSON.toJSON(marketing20));
        marketService.createMarketGood(pager.getContent(), marketing11);
        marketService.createMarketGood(pager.getContent(), marketing17);
        marketService.createMarketGood(pager.getContent(), marketing20);
    }
}
