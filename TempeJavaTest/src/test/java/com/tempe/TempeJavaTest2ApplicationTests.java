package com.tempe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TempeJavaTest2ApplicationTests {

	
	@Autowired
	private PricesRestController pricesRestController;
	
	@Test
	void contextLoads() {
	
		pricesRestController.getPrices(1L, 35455L, "2020-06-14T10:00:00.000Z");
		pricesRestController.getPrices(1L, 35455L, "2020-06-14T16:00:00.000Z");
		pricesRestController.getPrices(1L, 35455L, "2020-06-14T21:00:00.000Z");
		pricesRestController.getPrices(1L, 35455L, "2020-06-15T10:00:00.000Z");
		pricesRestController.getPrices(1L, 35455L, "2020-06-16T21:00:00.000Z");
		
	}
}
