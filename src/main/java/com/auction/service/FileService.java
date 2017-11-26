package com.auction.service;

import com.auction.dao.AuctionFileMapper;
import com.auction.domain.AuctionFile;
import com.auction.util.DownLoadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/26.
 */
@Service
public class FileService {

    @Autowired
    AuctionFileMapper auctionFileMapper;

    public String saveFile(AuctionFile auctionFile){
        long now = System.currentTimeMillis();
        auctionFile.setCreateTime(now);
        auctionFile.setUpdateTime(now);
        auctionFileMapper.insertSelective(auctionFile);
        return  DownLoadFileUtil.getImageUrl(auctionFile.getFileId());
    }
}
