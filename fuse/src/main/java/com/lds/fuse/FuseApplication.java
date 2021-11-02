package com.lds.fuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class FuseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuseApplication.class, args);
    }

    @Bean
    public RestTemplate createTemplate(){
        return new RestTemplate();
    }
}
