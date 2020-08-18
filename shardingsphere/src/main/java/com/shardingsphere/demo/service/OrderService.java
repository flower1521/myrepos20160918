package com.shardingsphere.demo.service;

import com.shardingsphere.demo.entity.Order;

import java.util.List;

/**
 * create by lcl on 2020/8/18 15:27
 */
public interface OrderService {
    void saveOrder(Order order);

    List<Order> selectAll();
}
