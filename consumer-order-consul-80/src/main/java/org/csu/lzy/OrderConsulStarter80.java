package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiZY
 * @create 2020-08-27 16:13:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulStarter80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulStarter80.class, args);
    }
}
