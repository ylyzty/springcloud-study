package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LiZY
 * @create 2020-08-24 15:04:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperOrderStarter80 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrderStarter80.class, args);
    }
}
