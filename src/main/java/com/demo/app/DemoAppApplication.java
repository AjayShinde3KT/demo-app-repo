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
        logger.info("Ajay Shinde Application");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

}
