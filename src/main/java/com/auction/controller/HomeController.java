package com.auction.controller;

import com.auction.constant.TagType;
import com.auction.domain.AuctionSysUser;
import com.auction.domain.Good;
import com.auction.domain.HeaderTag;
import com.auction.service.AuctionSysUserService;
import com.auction.service.AuctionTimeLineService;
import com.auction.service.HeaderTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/11/26.
 */
@Controller
@RequestMapping("/homeInfo")
public class HomeController {
    public static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    HeaderTagService headerTagService;
    @Autowired
    AuctionSysUserService auctionSysUserService;
    @Autowired
    AuctionTimeLineService auctionTimeLineService;

    @RequestMapping(value = "/list.do")
    @ResponseBody
    public Object getInfoByTagId(HttpServletRequest request, @RequestParam(value = "tagId", required = false) int tagId){

       HeaderTag headerTag =  headerTagService.getHeaderTagsById(tagId);

        if(TagType.TIMELINE.getType().equals(headerTag.getTagType())){
            AuctionSysUser sysUser = auctionSysUserService.getSupAdminSysUser();
            return auctionTimeLineService.getTimeLinesByUserId(sysUser.getUserId());
        }else if (TagType.ARTICLE.getType().equals(headerTag.getTagType())){
        }
        return null;
    }
}
