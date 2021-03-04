package com.tempe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepository extends JpaRepository<Prices,Long>{
	
	@Query("select p from Prices p where brand_Id = :brandId and product_id = :productId AND :currentDate BETWEEN START_DATE AND END_DATE ORDER BY PRIORITY DESC")
	public List<Prices> findAllByBrandIdAndProductIdAndCurrentDate(
	      @Param("brandId") Long brandId, 
	      @Param("productId") Long productId,
	      @Param("currentDate") String currentDate);
}
