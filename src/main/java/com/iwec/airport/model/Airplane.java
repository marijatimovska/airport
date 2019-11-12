package com.iwec.airport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airplane {

	private Integer id;

	@NonNull
	private String manufacturer;

	@NonNull
	private String model;

	private int totalSeats;

	private double totalCapacity;

	private DataAirplane data;

	
}
