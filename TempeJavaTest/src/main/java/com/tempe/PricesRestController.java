package com.tempe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricesRestController {
	
	@Autowired
	 private PricesService pricesService;
	
	@RequestMapping("/api/prices")
	 public List<Prices> getPrices() {
		List<Prices> prices = pricesService.retrievePrices();
	  return prices;
	 }
	  
	@RequestMapping("/api/prices/{brandId}")
	 public Prices getPrices(@PathVariable(name="brandId")Long brandId) {
		return pricesService.getPrices(brandId);
	 }
	
	@RequestMapping("/api/prices/{brandId}/products/{productId}")
	 public List<Prices> getPrices(@PathVariable(name="brandId")Long brandId, 
			 				       @PathVariable(name="productId")Long productId) {
		return pricesService.getPrices(brandId,productId);
	 }
	
	@RequestMapping("/api/prices/{brandId}/products/{productId}/date/{currentDate}")
	 public Prices getPrices(@PathVariable(name="brandId")Long brandId, 
			 				       @PathVariable(name="productId")Long productId,
	 							   @PathVariable(name="currentDate")String currentDate)
	{
		return pricesService.getPrices(brandId,productId,currentDate);
	 }
}
