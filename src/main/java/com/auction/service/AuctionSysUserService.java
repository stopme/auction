package com.auction.service;

import com.auction.dao.AuctionSysUserMapper;
import com.auction.domain.*;
import com.auction.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
@Service
public class AuctionSysUserService {
    public static Logger logger = LoggerFactory.getLogger(AuctionSysUserService.class);
    @Autowired
    AuctionSysUserMapper auctionSysUserMapper;
     @Autowired
    AuctionUserService auctionUserService;
    @Autowired
    AuctionTimeLineService auctionTimeLineService;

    @Autowired
    MarketService marketService;

    public int insertSysUser(AuctionSysUser auctionSysUser){
        return auctionSysUserMapper.insertSelective(auctionSysUser);
    }

    public AuctionSysUser getSupAdminSysUser(){
        return auctionSysUserMapper.selectSupAdmin();
    }


    public void createTimeline(){
        AuctionSysUser sysUser = getSupAdminSysUser();
        Date date = new Date();
        Marketing marketing11  = marketService.getMarketingWithByStartTime(DateUtil.getHourClock(date, 11));
        Marketing marketing17 = marketService.getMarketingWithByStartTime(DateUtil.getHourClock(date, 17));
        Marketing marketing20  = marketService.getMarketingWithByStartTime(DateUtil.getHourClock(date, 20));
        List<AuctionTimeLinePic> picList = new ArrayList<AuctionTimeLinePic>();
        AuctionTimeLine timeLine = new AuctionTimeLine();
        timeLine.setLineContent("天天简陋,每天3场竞拍,保证A货厂家直销就在今天"+DateUtil.convert2String(date,"yyyy-MM-dd"));
        timeLine.setUserId(sysUser.getUserId());
        timeLine.setUserNickname(sysUser.getNickname());
        AuctionTimeLinePic pic = new AuctionTimeLinePic();
        picList.addAll(buildTimeLinePic( marketing11));
        picList.addAll(buildTimeLinePic( marketing17));
        picList.addAll(buildTimeLinePic( marketing20));
        timeLine.setPics(picList);
        auctionTimeLineService.createTimeLine(timeLine);
    }
    private  List<AuctionTimeLinePic> buildTimeLinePic(Marketing marketing){
        List<AuctionTimeLinePic> picList = new ArrayList<AuctionTimeLinePic>();
        if (marketing != null && !CollectionUtils.isEmpty(marketing.getGoodList()) &&  !CollectionUtils.isEmpty(marketing.getGoodList().get(0).getGoodImageList()) ){
            AuctionTimeLinePic pic = null;
            int count=0;
            for (GoodImage goodImage : marketing.getGoodList().get(0).getGoodImageList()){
                pic = new AuctionTimeLinePic();
                pic.setCreateTime(System.currentTimeMillis());
                pic.setPicPath(goodImage.getImageUrl());
                count++;
                picList.add(pic);
                if (count >=3){
                    break;
                }
            }
        }
        return picList;
    }
}
