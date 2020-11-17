package com.b19g3r.cloud.controller;

import com.b19g3r.cloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xingxuntao
 * @date 2020-11-04 18:47
 */
@RestController
@Slf4j
public class OrderController {

    /**
     * 区分大小写
     */
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentzk() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }
}
