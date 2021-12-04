/**
 * @author: T^T
 * @date: 2021/12/2 上午 11:50
 * @description
 * @slogan: 与其感慨路难行 不如拔起树根马上出发吧 目标采石场
 */
package com.tt.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author T^T
 * @date Create in 2021/12/2 上午 11:50
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功！");
        String msg = restTemplate.getForObject("http://localhost:8088/stock/reduct", String.class);
        return msg;
    }
}
