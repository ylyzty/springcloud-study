package org.csu.lzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.csu.lzy.entities.CommonResult;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-08-27 15:24:01
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：");
        if(payment!=null){
            return new CommonResult(200,"查询成功, serverPort:"+serverPort,payment);
        }
        else {
            return new CommonResult(444,"查询失败, serverPort:"+serverPort,null);
        }
    }

    @PostMapping(value = "/payment/post")
    public CommonResult postPayment(@RequestBody Payment payment){
        int result = paymentService.postPayment(payment);
        if (result>0){
            return new CommonResult(200,"插入成功, serverPort:"+serverPort,payment);
        }
        else {
            return new CommonResult(444,"插入失败, serverPort:"+serverPort,null);
        }
    }
}
