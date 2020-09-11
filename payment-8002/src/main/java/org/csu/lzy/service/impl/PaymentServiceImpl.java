package org.csu.lzy.service.impl;

import org.csu.lzy.dao.PaymentDao;
import org.csu.lzy.entities.Payment;
import org.csu.lzy.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LiZY
 * @create 2020-08-17 19:12:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDAO;

    @Override
    public int postPayment(Payment payment) {
        return paymentDAO.postPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }
}
