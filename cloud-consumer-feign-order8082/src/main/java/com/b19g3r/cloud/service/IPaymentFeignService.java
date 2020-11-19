package com.b19g3r.cloud.service;

import com.b19g3r.cloud.entities.CommonResult;
import com.b19g3r.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xingxuntao
 * @date 2020-11-19 下午6:48
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface IPaymentFeignService {

    /**
     * 根据ID查询支付数据
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
