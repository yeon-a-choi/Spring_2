package com.ee.y2;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String fuel="Gas";

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	

}