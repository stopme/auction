package com.auction.controller;

import com.auction.domain.Banner;
import com.auction.service.BannerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/banner")
public class BannerController {
    
    public static Logger logger = LoggerFactory.getLogger(BannerController.class);

    @Autowired
    BannerService bannerService;
    
    @RequestMapping("/list")
    @ResponseBody
    public Object toIndex(HttpServletRequest request, @RequestParam(value = "pageIndex", required = true) Integer pageIndex) {
        List<Banner> bannerList = bannerService.getBannerByPageIndex(pageIndex);
        logger.info("config get mallName config key {}  config object  {}", pageIndex, bannerList);
        return bannerList;
    }
    
}