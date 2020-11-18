package com.b19g3r.cloud;

import com.b19g3r.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2020-10-16 1:11 AM
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class Order80 {

    public static void main(String[] args) {
        SpringApplication.run(Order80.class, args);
    }
}
