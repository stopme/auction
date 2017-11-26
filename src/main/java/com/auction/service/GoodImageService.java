package com.auction.service;

import com.alibaba.fastjson.JSON;
import com.auction.dao.GoodImageMapper;
import com.auction.dao.MarketingMapper;
import com.auction.domain.GoodImage;
import com.auction.domain.Marketing;
import com.auction.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by 李枝 on 2017/11/25.
 */
@Service
public class GoodImageService {
    public static Logger logger = LoggerFactory.getLogger(GoodImageService.class);
    @Autowired
    GoodImageMapper goodImageMapper;

    @Transactional
    public int createGoodImages(List<GoodImage> goodImageList, int goodId){
       if(null == goodImageList || goodImageList.isEmpty()){
            return 0;
       }
        int count = 0;
        for(int i=0; i < goodImageList.size(); i++ ){
            GoodImage goodImage = goodImageList.get(i);
            goodImage.setGoodId(goodId);
            goodImageMapper.insertSelective(goodImageList.get(i));
            count++;
        }
        return count;
    }

    @Transactional(propagation= Propagation.REQUIRED)
    public int createGoodImage(GoodImage goodImage, int goodId){
        if(null == goodImage ){
            return 0;
        }
        goodImage.setGoodId(goodId);
        return  goodImageMapper.insertSelective(goodImage);
    }

    public  List<GoodImage> getGoodImages( int goodId){
        return  goodImageMapper.getGoodImagesByGoodId(goodId);
    }




}
