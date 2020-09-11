package org.csu.lzy;

import org.csu.ribbonRule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author LiZY
 * @create 2020-08-11 16:12:31
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "cloud-payment-service", configuration = MyRule.class)
public class ConsumerOrderStarter80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderStarter80.class, args);
    }
}
