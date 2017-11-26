package com.jtest.service;

import com.alibaba.fastjson.JSON;
import com.auction.constant.TagType;
import com.auction.domain.AuctionSysUser;
import com.auction.domain.HeaderTag;
import com.auction.service.AuctionSysUserService;
import com.auction.service.AuctionTimeLineService;
import com.auction.service.HeaderTagService;
import com.jtest.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/11/26.
 */
public class TimeLineTest extends BaseJunit4Test {

    @Autowired
    HeaderTagService headerTagService;
    @Autowired
    AuctionSysUserService auctionSysUserService;
    @Autowired
    AuctionTimeLineService auctionTimeLineService;
    @Test
    public void testHomeInfo(){
        int tagId = 1;
        HeaderTag headerTag =  headerTagService.getHeaderTagsById(tagId);
        if(TagType.TIMELINE.getType().equals(headerTag.getTagType())){
            AuctionSysUser sysUser = auctionSysUserService.getSupAdminSysUser();
            System.out.println(JSON.toJSON(sysUser));
            System.out.println(JSON.toJSON(auctionTimeLineService.getTimeLinesByUserId(sysUser.getUserId())));
        }else if (TagType.ARTICLE.getType().equals(headerTag.getTagType())){
        }
    }
}
