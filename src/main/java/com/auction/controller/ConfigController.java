package com.auction.controller;

import com.auction.domain.Config;
import com.auction.domain.HeaderTag;
import com.auction.service.ConfigService;
import com.auction.service.HeaderTagService;
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
@RequestMapping("/config")
public class ConfigController {
    
    public static Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Autowired
    ConfigService configService;

    @Autowired
    HeaderTagService headerTagService;


    @RequestMapping("/getValue")
    @ResponseBody
    public Object toIndex(HttpServletRequest request, @RequestParam(value = "configKey", required = true) String configKey) {
        Config config = configService.getConfig(configKey);
        logger.info("config get mallName config key {}  config object  {}", new Object[]{configKey, config});
        return config;
    }

    @RequestMapping("/getHeaderTag")
    @ResponseBody
    public Object getCategory(HttpServletRequest request) {
        List<HeaderTag> result = headerTagService.getAllHeaderTags();
        logger.info("config get mallName config key {}  config object  {}", result);
        return result;
    }
    
}