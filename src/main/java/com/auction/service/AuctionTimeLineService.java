package com.auction.service;

import com.auction.dao.AuctionTimeLineMapper;
import com.auction.dao.AuctionTimeLinePicMapper;
import com.auction.domain.AuctionTimeLine;
import com.auction.domain.AuctionTimeLinePic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
@Service
public class AuctionTimeLineService {

    @Autowired
    AuctionTimeLineMapper auctionTimeLineMapper;

    @Autowired
    AuctionTimeLinePicMapper auctionTimeLinePicMapper;

    public int createTimeLine(AuctionTimeLine timeLine){
        long now = System.currentTimeMillis();
        timeLine.setCreateTime(now);
        timeLine.setUpdateTime(now);
        int id = auctionTimeLineMapper.insertSelective(timeLine);
        if(!CollectionUtils.isEmpty(timeLine.getPics())){
            for (AuctionTimeLinePic pic : timeLine.getPics()){
                pic.setCreateTime(now);
                pic.setUpdateTime(now);
                pic.setLineId(timeLine.getId());
                auctionTimeLinePicMapper.insertSelective(pic);
            }
        }
        return id;
    }

    public List<AuctionTimeLine> getTimeLinesByUserId(int userId){

        List<AuctionTimeLine> timeLines = auctionTimeLineMapper.selectByUserId(userId);
        for(AuctionTimeLine timeLine : timeLines){
            List<AuctionTimeLinePic> pics = auctionTimeLinePicMapper.selectByTimeLineId(timeLine.getId());
            timeLine.setPics(pics);
        }
        return timeLines;
    }
}
