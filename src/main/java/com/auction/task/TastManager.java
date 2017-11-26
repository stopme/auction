package com.auction.task;

import com.auction.domain.*;
import com.auction.service.AuctionSysUserService;
import com.auction.service.AuctionTimeLineService;
import com.auction.service.MarketService;
import com.auction.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/25.
 */
@Component
public class TastManager {

    public static Logger logger = LoggerFactory.getLogger(TastManager.class);
    @Autowired
    MarketService marketService;

    @Autowired
    AuctionSysUserService auctionSysUserService;

    @Autowired
    AuctionTimeLineService auctionTimeLineService;


    /**
     * 每天凌晨1点执行
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void createTimeline(){
        long start = System.currentTimeMillis();
        logger.info("执行任务开始: {}", DateUtil.getCurrentDate(DateUtil.defaultString));
        auctionSysUserService.createTimeline();
        long end = System.currentTimeMillis();
        logger.info("执行任务结束: 执行时间 {}", end - start);

    }

}
