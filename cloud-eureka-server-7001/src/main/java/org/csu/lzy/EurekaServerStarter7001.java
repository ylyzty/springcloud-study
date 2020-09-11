package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LiZY
 * @create 2020-08-13 16:29:17
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStarter7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStarter7001.class, args);
    }
}
