package com.coforge.training.springcore.model;

//Bean class for DI using Annotation Configuration

public class Airline {
	private String name;
	private int code;
	private String country;
	
	
	/**
	 * @param name
	 * @param code
	 * @param country
	 */
	public Airline(String name, int code, String country) {
		super();
		this.name = name;
		this.code = code;
		this.country = country;
	}
	
	public void display() {
		System.out.println(this.name+" "+this.code+" "+this.country);
	}
	
	
}
