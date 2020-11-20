package com.b19g3r.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2020-10-16 1:11 AM
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignOrder8082 {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrder8082.class, args);
    }
}
