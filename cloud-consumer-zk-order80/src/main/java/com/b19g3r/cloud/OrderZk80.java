package com.b19g3r.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2020-10-16 1:11 AM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZk80.class, args);
    }
}
