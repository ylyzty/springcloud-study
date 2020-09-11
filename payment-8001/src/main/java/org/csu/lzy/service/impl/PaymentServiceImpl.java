package org.csu.lzy.service.impl;

import org.csu.lzy.dao.PaymentDao;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-08-11-14:45:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int postPayment(Payment payment) { return paymentDao.postPayment(payment); }

    @Override
    public Payment getPaymentById(Long id) { return paymentDao.getPaymentById(id); }
}
