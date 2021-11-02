package com.example.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TulingApplication.class, args);
    }

}

