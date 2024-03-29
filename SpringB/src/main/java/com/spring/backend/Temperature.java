package com.spring.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/* Entity class as per database */
@Entity
@Table(name = "temperature")
public class Temperature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;
	@Getter@Setter
	private double temp;
	@Getter@Setter
	private String plats;
	
	/* Default constructor */
	public Temperature() {	
	}
}
