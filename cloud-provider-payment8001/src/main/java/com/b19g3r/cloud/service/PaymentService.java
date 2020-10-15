package com.b19g3r.cloud.service;

import com.b19g3r.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:56
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
