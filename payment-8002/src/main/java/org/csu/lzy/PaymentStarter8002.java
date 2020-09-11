package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LiZY
 * @create 2020-08-17 19:05:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentStarter8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentStarter8002.class, args);
    }
}
