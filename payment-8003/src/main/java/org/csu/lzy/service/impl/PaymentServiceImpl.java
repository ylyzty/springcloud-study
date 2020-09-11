package org.csu.lzy.service.impl;

import org.csu.lzy.dao.PaymentDao;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-09-07 16:08:10
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int postPayment(Payment payment) {
        return paymentDao.postPayment(payment);
    }
}
