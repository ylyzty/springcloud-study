package org.csu.lzy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.csu.lzy.entities.Payment;

/**
 * @author LiZY
 * @create 2020-08-11-14:28:50
 */
@Mapper
public interface PaymentDao {


    public int postPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
