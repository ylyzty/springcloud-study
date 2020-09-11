package org.csu.lzy.service;

import org.apache.ibatis.annotations.Param;
import org.csu.lzy.dao.PaymentDao;
import org.csu.lzy.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-09-07 16:04:23
 */

public interface PaymentService {

    public Payment getPaymentById(@Param("id") Long id);

    public int postPayment(Payment payment);
}
