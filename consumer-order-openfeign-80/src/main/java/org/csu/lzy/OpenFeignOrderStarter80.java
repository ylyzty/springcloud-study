package org.csu.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LiZY
 * @create 2020-09-09 16:20:20
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrderStarter80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrderStarter80.class, args);
    }
}
