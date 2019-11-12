package com.iwec.airport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataAirplane {
	private Integer id;
	
	private int seats;

	private double capacity;
}
