package com.coforge.training.producthive.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//Model class for Registration of Users Address fields
@Entity
public class Address {


	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Numbering from 1
	private Long addressId;
	

	private String street;
	private String city;
	private  int pincode;
	
	//Foreign Key Relationship
	@OneToOne  //One to One MApping
	@JoinColumn(name="dealer_id") //Foreign key field
	private Dealer dealer; //Reference Class Object

	
	public Address() {
		super();
	}
	/**
	 * @param street
	 * @param city
	 * @param pincode
	 */
	
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address(Long addressId, String street, String city, int pincode, Dealer dealer) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.dealer = dealer;
	}

	
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 * @param street
	 * @param city
	 * @param pincode
	 * @param dealer
	 */
	
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the dealer
	 */
	public Dealer getDealer() {
		return dealer;
	}

	/**
	 * @param dealer the dealer to set
	 */
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	/**
	 * 
	 */

	
}
