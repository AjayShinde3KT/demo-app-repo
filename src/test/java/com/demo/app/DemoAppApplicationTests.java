package com.demo.app;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoAppApplicationTests {

	static Logger logger = LoggerFactory.getLogger(DemoAppApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Cases are executing!!!!!!!");
		logger.info("Test Cases By Ajay Shinde !!");
		assertEquals(true,true);
	}

}
