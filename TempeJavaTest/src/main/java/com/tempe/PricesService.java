package com.tempe;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PricesService {
	
	LocalDate localDate = LocalDate.now();
	Date date = new Date();
	
	public List<Prices> retrievePrices();
	  
	public Prices getPrices(Long brandId);
	
	public List<Prices> getPrices(Long brandId,Long productId);
	
	public Prices getPrices(Long brandId,Long productId,String currentDate);
}
