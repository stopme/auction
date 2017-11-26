package com.jtest.service;

import com.alibaba.fastjson.JSON;
import com.auction.constant.UserRemark;
import com.auction.domain.AuctionUser;
import com.auction.service.AuctionSysUserService;
import com.auction.service.AuctionUserService;
import com.jtest.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/11/26.
 */
public class AuctionUserServiceTest extends BaseJunit4Test {

    @Autowired
    AuctionUserService auctionUserService;
    @Autowired
    AuctionSysUserService auctionSysUserService;

    @Test
    public void createUserTest(){
        AuctionUser auctionUser = new AuctionUser();
        auctionUser.setNickname("玉有价");
        auctionUser.setCreateTime(System.currentTimeMillis());
        auctionUser.setOpenId("dafasdfadfa121323");
        auctionUser.setCity("beijing");
        auctionUser.setRemark(UserRemark.ADMIN.getCode());
        auctionUserService.createUser(auctionUser);
    }
    @Test
    public void getSupAdminTest(){
        System.out.println("******* "+ JSON.toJSON(auctionSysUserService.getSupAdminSysUser()));;
    }
}
