package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LiZY
 * @create 2020-09-07 16:00:11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class PaymentStarter8003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentStarter8003.class, args);
    }
}
