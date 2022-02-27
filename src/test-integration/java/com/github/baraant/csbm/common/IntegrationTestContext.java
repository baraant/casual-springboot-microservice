package com.github.baraant.csbm.common;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.baraant.csbm"})
public class IntegrationTestContext {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationTestContext.class);
    }
}
