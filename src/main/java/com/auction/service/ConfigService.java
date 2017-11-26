package com.auction.service;

import com.auction.dao.ConfigMapper;
import com.auction.dao.OrderMapper;
import com.auction.domain.Config;
import com.auction.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Autowired
    ConfigMapper configMapper;


    
    public Config getConfig(String configKey) {
        return configMapper.selectByConfigKey(configKey);
    }

}