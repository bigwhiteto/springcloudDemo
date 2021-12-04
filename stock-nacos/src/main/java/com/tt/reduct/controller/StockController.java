/**
 * @author: T^T
 * @date: 2021/12/2 上午 11:56
 * @description
 * @slogan: 与其感慨路难行 不如拔起树根马上出发吧 目标采石场
 */
package com.tt.reduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author T^T
 * @date Create in 2021/12/2 上午 11:56
 * @description
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存");
        return "扣减库存" + port;
    }
}
