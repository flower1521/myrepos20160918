package com.shardingsphere.demo.mapper;

import com.shardingsphere.demo.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * create by lcl on 2020/8/18 15:19
 */
@Repository
public interface OrderMapper {
    void insertOrder(Order order);

    List<Order> findAll();
}
