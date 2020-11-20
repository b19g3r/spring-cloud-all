package com.b19g3r.cloud.service;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:56
 */
public interface PaymentService {
    String paymentInfoOk(Integer id);

    String paymentInfoTimeout(Integer id);
}
