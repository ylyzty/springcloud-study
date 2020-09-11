package org.csu.lzy.service;

import org.apache.ibatis.annotations.Param;
import org.csu.lzy.entities.Payment;

/**
 * @author LiZY
 * @create 2020-08-27 15:20:24
 */
public interface PaymentService {

    public Payment getPaymentById(@Param("id") Long id);

    public int postPayment(Payment payment);
}
