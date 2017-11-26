package com.jtest.service;

import com.auction.service.AuctionSysUserService;
import com.jtest.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/11/26.
 */
public class TaskTest extends BaseJunit4Test{

    @Autowired
    AuctionSysUserService auctionSysUserService;

    @Test
    public void testCreateLine(){
        auctionSysUserService.createTimeline();
    }
}
