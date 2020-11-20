package com.b19g3r.cloud.service.impl;

import com.b19g3r.cloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:55
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfoOk(Integer id) {
        return Thread.currentThread().getName() + "... paymentInfo OK.";
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler")
    @Override
    public String paymentInfoTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            log.error("InterruptedException e:", e);
        }
        return Thread.currentThread().getName() + id + "... paymentInfo timeout. 耗时3s";
    }

    public String paymentInfoTimeoutHander(Integer id) {
        return Thread.currentThread().getName() + "... paymentInfo timeout handler.";
    }

}
