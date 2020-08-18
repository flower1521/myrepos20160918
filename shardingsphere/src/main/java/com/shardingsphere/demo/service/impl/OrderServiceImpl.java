package com.shardingsphere.demo.service.impl;

import com.shardingsphere.demo.entity.Order;
import com.shardingsphere.demo.mapper.OrderMapper;
import com.shardingsphere.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by lcl on 2020/8/18 15:27
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void saveOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    @Override
    public List<Order> selectAll() {
        return orderMapper.findAll();
    }
}
