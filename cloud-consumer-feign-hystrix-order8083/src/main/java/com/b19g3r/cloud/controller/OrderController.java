package com.b19g3r.cloud.controller;

import com.b19g3r.cloud.entities.CommonResult;
import com.b19g3r.cloud.entities.Payment;
import com.b19g3r.cloud.service.IPaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:47
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private IPaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/feign/getPayment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info("Consumer：根据id【" + id + "】查询支付数据。");
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout/{id}")
    public String paymentFeignTimeout(@PathVariable("id") Integer id) {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout(id);
    }

}
