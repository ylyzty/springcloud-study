package org.csu.lzy.service;

import org.apache.ibatis.annotations.Param;
import org.csu.lzy.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author LiZY
 * @create 2020-08-17 19:10:44
 */
public interface PaymentService {

    public int postPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
