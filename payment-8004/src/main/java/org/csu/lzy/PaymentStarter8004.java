package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiZY
 * @create 2020-08-24 14:38:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentStarter8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentStarter8004.class, args);
    }
}
