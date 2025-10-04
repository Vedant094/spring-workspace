package com.coforge.training.springcore;

import org.springframework.stereotype.Component;

import com.coforge.training.springcore.model.Airline;

@Component
public class AirlineService {
	
	public Airline getSimpleAirlin() {
		return new Airline("AirIndia",101,"India");
	}
}
