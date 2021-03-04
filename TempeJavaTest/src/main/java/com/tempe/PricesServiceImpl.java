package com.tempe;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl implements PricesService{

	@Autowired
	 private PricesRepository pricesRepository;

	@Override
	public Prices getPrices(Long brandId, Long productId, String currentDate) {
		List<Prices> prices = pricesRepository.findAllByBrandIdAndProductIdAndCurrentDate(brandId, productId,currentDate);
		System.out.println("brandId: " + brandId+" productId: "+productId+" currentDate: "+currentDate);
		return prices.get(0);
	}
}
