package com.tempe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricesRestController {
	
	@Autowired
	 private PricesService pricesService;
	
	@RequestMapping("/api/prices/{brandId}/products/{productId}/date/{currentDate}")
	 public Prices getPrices(@PathVariable(name="brandId")Long brandId, 
			 				 @PathVariable(name="productId")Long productId,
	 					     @PathVariable(name="currentDate")String currentDate)
	{
		return pricesService.getPrices(brandId,productId,currentDate);
	 }
}
