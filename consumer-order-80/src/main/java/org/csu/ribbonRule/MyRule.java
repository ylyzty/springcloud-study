package org.csu.ribbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiZY
 * @create 2020-08-27 17:29:22
 */
@Configuration
public class MyRule {

    @Bean
    public IRule setRule(){
        return new RandomRule();
    }
}
