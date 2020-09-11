package org.csu.lzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-08-24 15:07:55
 */
@RestController
@Slf4j
public class OrderController {

    public static final String URL="http://cluod-payment-service/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String payment(){
        /**
         * getForObject两种类型
         * 1. url, 返回类型
         * 2. url, 入参, 返回类型
         */
        String result = restTemplate.getForObject(URL+"payment/zk", String.class);
        return result;
    }

}
