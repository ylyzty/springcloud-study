package org.csu.lzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.csu.lzy.entities.CommonResult;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiZY
 * @create 2020-08-11-14:50:09
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/post")
    public CommonResult postPayment(@RequestBody Payment payment){
        int result = paymentService.postPayment(payment);
        log.info("插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入成功, serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果："+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功, serverPort: "+serverPort,payment);
        }else{
            return new CommonResult(444,"未找到匹配项",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discoveryClientInformation(){
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(String service : services){
            log.info("service: "+service);
        }

        for(ServiceInstance instance : instances){
            log.info("instance："+instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return "serverPort: "+serverPort;
    }
}
