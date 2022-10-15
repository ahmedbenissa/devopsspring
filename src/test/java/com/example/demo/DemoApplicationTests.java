package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.services.StockServiceImpl;

@SpringBootTest
class DemoApplicationTests {
	StockServiceImpl ss;
	@Test
	void contextLoads() {
		ss.retrieveAllStocks();
	}

}
