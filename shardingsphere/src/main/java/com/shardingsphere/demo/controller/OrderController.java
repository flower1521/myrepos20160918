package com.shardingsphere.demo.controller;

import com.shardingsphere.demo.entity.Order;
import com.shardingsphere.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by lcl on 2020/8/18 15:28
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/addOrder")
    public String save() {
        try {
            Order order1 = new Order();
            order1.setUserId(2);
            order1.setOrderId(2);
            orderService.saveOrder(order1);

            Order order2 = new Order();
            order2.setUserId(3);
            order2.setOrderId(3);
            orderService.saveOrder(order2);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    @GetMapping("/findAll")
    public String find() {
        try {
            List<Order> list = orderService.selectAll();
            list.forEach(o -> System.out.println(o));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
