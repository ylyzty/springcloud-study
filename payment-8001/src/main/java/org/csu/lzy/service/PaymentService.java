package org.csu.lzy.service;


import org.apache.ibatis.annotations.Param;
import org.csu.lzy.entities.Payment;

/**
 * @author LiZY
 * @create 2020-08-11-14:40:05
 */

public interface PaymentService {

    public int postPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
