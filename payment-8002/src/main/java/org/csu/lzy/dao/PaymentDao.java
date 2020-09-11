package org.csu.lzy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.csu.lzy.entities.Payment;

/**
 * @author LiZY
 * @create 2020-08-17 19:08:32
 */
@Mapper
public interface PaymentDao {

    public int postPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
