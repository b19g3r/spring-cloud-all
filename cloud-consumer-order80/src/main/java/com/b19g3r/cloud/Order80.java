package com.b19g3r.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2020-10-16 1:11 AM
 */
@SpringBootApplication
@EnableEurekaClient
public class Order80 {

    public static void main(String[] args) {
        SpringApplication.run(Order80.class, args);
    }
}
