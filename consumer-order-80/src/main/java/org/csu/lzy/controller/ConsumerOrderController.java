package org.csu.lzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.csu.lzy.entities.CommonResult;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author LiZY
 * @create 2020-08-11 16:18:35
 */

@Slf4j
@RestController
public class ConsumerOrderController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    public String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @PostMapping(value = "/consumer/payment/post")
    public CommonResult<Payment> postPayment(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/post", payment, CommonResult.class);
    }

    @PostMapping(value = "/consumer/payment/entity/post")
    public CommonResult<Payment> postPayment2(Payment payment){
        return restTemplate.postForEntity(PAYMENT_URL+"/payment/post",payment,CommonResult.class).getBody();
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/entity/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }
        else {
            return new CommonResult<>(444,"操作失败",null);
        }
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }
}
