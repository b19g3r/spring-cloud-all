package com.b19g3r.cloud.service.impl;

import com.b19g3r.cloud.dao.PaymentDao;
import com.b19g3r.cloud.entities.Payment;
import com.b19g3r.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:55
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
