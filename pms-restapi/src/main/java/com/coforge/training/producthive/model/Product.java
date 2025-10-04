package com.coforge.training.producthive.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity

public class Product {
	/*
	 * The @Id annotation specifies the primary key of an entity.
	 * @GeneratedValue provides for the specification of generation strategies for the values of primary keys.
	 * @SequenceGenerator, you can specify the sequence name, initial value, and allocation size for the 
	 * sequence. 
	 * This allows you to control the sequence generation process and ensure database consistency. 
	 */
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "prod_seq")
		 @SequenceGenerator(name="prod_seq",initialValue = 1000,allocationSize = 1)
	   	 private Long pid;
		 
		 @Column(nullable = false)
	     private String name;
		 
		 @Column(nullable = false)
	     private String brand;
		 
		 @Column(nullable = false)
	     private String madein;
		 
		 @Column(nullable = false)
	     private float price;

		 /**
 		 * 
 		 */
		 public Product() {
			super();
		 }

		 /**
 		 * @param pid
 		 * @param name
 		 * @param brand
 		 * @param madein
 		 * @param price
 		 */
		 public Product(Long pid, String name, String brand, String madein, float price) {
			super();
			this.pid = pid;
			this.name = name;
			this.brand = brand;
			this.madein = madein;
			this.price = price;
		 }

		 /**
 		 * @return the pid
 		 */
		 public Long getPid() {
			 return pid;
		 }

		 /**
 		 * @param pid the pid to set
 		 */
		 public void setPid(Long pid) {
			 this.pid = pid;
		 }

		 /**
 		 * @return the name
 		 */
		 public String getName() {
			 return name;
		 }

		 /**
 		 * @param name the name to set
 		 */
		 public void setName(String name) {
			 this.name = name;
		 }

		 /**
 		 * @return the brand
 		 */
		 public String getBrand() {
			 return brand;
		 }

		 /**
 		 * @param brand the brand to set
 		 */
		 public void setBrand(String brand) {
			 this.brand = brand;
		 }

		 /**
 		 * @return the madein
 		 */
		 public String getMadein() {
			 return madein;
		 }

		 /**
 		 * @param madein the madein to set
 		 */
		 public void setMadein(String madein) {
			 this.madein = madein;
		 }

		 /**
 		 * @return the price
 		 */
		 public float getPrice() {
			 return price;
		 }

		 /**
 		 * @param price the price to set
 		 */
		 public void setPrice(float price) {
			 this.price = price;
		 }
		 
		 
}
