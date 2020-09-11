package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiZY
 * @create 2020-08-27 14:55:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulStarter8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulStarter8005.class, args);
    }
}
