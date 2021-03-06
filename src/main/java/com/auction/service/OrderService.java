package com.auction.service;

import com.auction.dao.OrderMapper;
import com.auction.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;


    
    public Order getOrder(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }

}