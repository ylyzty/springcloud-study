package org.csu.lzy.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author LiZY
 * @create 2020-09-07 16:59:57
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
