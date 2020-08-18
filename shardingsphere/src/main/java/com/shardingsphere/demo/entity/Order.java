package com.shardingsphere.demo.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * create by lcl on 2020/8/18 15:13
 */
@Data
@ToString
public class Order implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer orderId;
}
