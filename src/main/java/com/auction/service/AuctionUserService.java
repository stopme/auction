package com.auction.service;

import com.auction.constant.UserRemark;
import com.auction.dao.AuctionUserMapper;
import com.auction.domain.AuctionSysUser;
import com.auction.domain.AuctionUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/26.
 */
@Service
public class AuctionUserService {

    @Autowired
    AuctionSysUserService auctionSysUserService;
    @Autowired
    AuctionUserMapper auctionUserMapper;

    public int createUser(AuctionUser auctionUser){
        int id  = auctionUserMapper.insertSelective(auctionUser);
        if(auctionUser.getRemark().equals(UserRemark.ADMIN.getCode())){
            AuctionSysUser sysUser = new AuctionSysUser();
            sysUser.setNickname(auctionUser.getNickname());
            sysUser.setAdminLevel(10);
            sysUser.setCreateTime(System.currentTimeMillis());
            sysUser.setUserId(auctionUser.getId());
            auctionSysUserService.insertSysUser(sysUser);
        }
        return id;
    }
}
