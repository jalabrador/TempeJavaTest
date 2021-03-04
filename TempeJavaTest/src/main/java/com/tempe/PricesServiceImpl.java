package com.tempe;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl implements PricesService{

	@Autowired
	 private PricesRepository pricesRepository;
	 
	
	@Override
	public List<Prices> retrievePrices() {
		List<Prices> prices = pricesRepository.findAll();
		return prices;
	}

	@Override
	public Prices getPrices(Long brandId) {
		Optional<Prices> prices = pricesRepository.findById(brandId);
		return  prices.get();
	}

	@Override
	public List<Prices> getPrices(Long brandId, Long productId) {
					
		List<Prices> prices = pricesRepository.findAllByBrandIdAndProductId(brandId, productId);
		System.out.println("brandId: " + brandId+" productId: "+productId);
		return prices;
	}

	@Override
	public Prices getPrices(Long brandId, Long productId, String currentDate) {
		List<Prices> prices = pricesRepository.findAllByBrandIdAndProductIdAndCurrentDate(brandId, productId,currentDate);
		//System.out.println("brandId: " + brandId+" productId: "+productId+" currentDate: "+currentDate);
		return prices.get(0);
	}
}
