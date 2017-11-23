package com.auction.controller;

import com.auction.domain.Order;
import com.auction.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class OrderController {
    


    @Autowired
    OrderService orderService;
    
    @RequestMapping("/showOrder")
    public String toIndex(HttpServletRequest request,Model model) {
        System.out.println("UserController showUser");
        int id = Integer.parseInt(request.getParameter("id"));  
        Order order = orderService.getOrder(id);
        model.addAttribute("order", order);
        return "showOrder";
    }
    
}