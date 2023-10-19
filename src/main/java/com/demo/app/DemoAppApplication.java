package com.demo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class DemoAppApplication {

    static Logger logger = LoggerFactory.getLogger(DemoAppApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Application Started!!!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        logger.info("Application Executed!!!!1");
        SpringApplication.run(DemoAppApplication.class, args);
    }

}
