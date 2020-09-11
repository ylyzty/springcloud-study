package org.csu.lzy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.csu.lzy.entities.Payment;

/**
 * @author LiZY
 * @create 2020-08-27 14:57:06
 */

@Mapper
public interface PaymentDao {

    public Payment getPaymentById(@Param("id") Long id);

    public int postPayment(Payment payment);

}
