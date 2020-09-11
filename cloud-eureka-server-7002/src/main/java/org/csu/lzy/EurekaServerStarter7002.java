package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LiZY
 * @create 2020-08-17 18:46:19
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStarter7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStarter7002.class, args);
    }
}
