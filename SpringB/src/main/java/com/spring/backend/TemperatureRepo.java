package com.spring.backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TemperatureRepo extends JpaRepository<Temperature, Long>{
	
	/* JpaRepo interface defining queries for GET requests */
	
	@Query(value = "SELECT * FROM temperature WHERE plats = '<Location of sensor>' ORDER BY datum DESC LIMIT 50", nativeQuery = true)
	List<Temperature> findAllByPlatsUppsala();
	
	@Query(value = "SELECT * FROM temperature WHERE plats = '<Location of sensor>' ORDER BY datum DESC LIMIT 50", nativeQuery = true)
	List<Temperature> findAllByPlatsStockholmE();
	
	@Query(value = "SELECT * FROM temperature WHERE plats = '<Location of sensor>' ORDER BY datum DESC LIMIT 50", nativeQuery = true)
	List<Temperature> findAllByPlatsStockholmW();
}
