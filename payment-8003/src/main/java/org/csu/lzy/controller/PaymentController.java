package org.csu.lzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.csu.lzy.entities.CommonResult;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-09-07 16:09:50
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment!=null){
            log.info("查询成功");
            return new CommonResult(200,"查询成功, serverPort: "+serverPort, payment);
        }else {
            log.info("查询失败");
            return new CommonResult(444,"查询失败",null);
        }
    }

    @PostMapping(value = "/payment/post")
    public CommonResult postPayment(@RequestBody Payment payment){
        int result = paymentService.postPayment(payment);
        if(result>0){
            return new CommonResult(200,"添加成功",payment);
        }else {
            return new CommonResult(444,"添加失败",null);
        }
    }
}
