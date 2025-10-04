package com.coforge.training.springweb.model;

public class Reservation {
	private String firstName;  
    private String lastName;  
    private String Gender;  
    private String[] Food;  
    private String cityFrom;  
    private String cityTo;
    
    
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the food
	 */
	public String[] getFood() {
		return Food;
	}
	/**
	 * @param food the food to set
	 */
	public void setFood(String[] food) {
		Food = food;
	}
	/**
	 * @return the cityFrom
	 */
	public String getCityFrom() {
		return cityFrom;
	}
	/**
	 * @param cityFrom the cityFrom to set
	 */
	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}
	/**
	 * @return the cityTo
	 */
	public String getCityTo() {
		return cityTo;
	}
	/**
	 * @param cityTo the cityTo to set
	 */
	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}
    
    
}
