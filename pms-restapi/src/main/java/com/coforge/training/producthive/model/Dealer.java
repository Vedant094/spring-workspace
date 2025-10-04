package com.coforge.training.producthive.model;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.Base64;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Model class for Registration of Users Personal fields 
//* 		with 1-1 Mapping with Address class

@Entity
@Table(name="dealers")
public class Dealer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY,generator = "dealer_seq")
	@SequenceGenerator(name="dealer_seq",initialValue = 101, allocationSize = 1)
	@Column(name="did")
	private Long id;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	@Column(name="first_name",nullable=false)
	private String fname;
	
	@Column(name="last_name",nullable=false)
	private String lname;
	
	@NotBlank(message="Password cannot be blank")
	@Size(min=8,max=255, message="Password must be between 8 and 255 characters")
	@Column(name="password",nullable=false)
	private String password;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(nullable=false)
	private Date dob;
	
	@Column(name="phone",unique=true,nullable=false)
	private String phoneNo;
	
	
	/*Primary Key - Foreign Key Relationship
	 * Model 1-1 Bi-Directional Mapping b/n Dealer & Address
	 * */
	
	@OneToOne(mappedBy="dealer", cascade=CascadeType.ALL)
	private Address address; //has a relationship


	/**
	 * 
	 */
	public Dealer() {
		
	}


	/**
	 * @param id
	 * @param email
	 * @param fname
	 * @param lname
	 * @param password
	 * @param dob
	 * @param phoneNo
	 */
	public Dealer(Long id, String email, String fname, String lname,
			@NotBlank(message = "Password cannot be blank") @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters") String password,
			Date dob, String phoneNo) {
		super();
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}


	/**
	 * @param id
	 * @param email
	 * @param fname
	 * @param lname
	 * @param password
	 * @param dob
	 * @param phoneNo
	 * @param address
	 */
	public Dealer(Long id, String email, String fname, String lname,
			@NotBlank(message = "Password cannot be blank") @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters") String password,
			Date dob, String phoneNo, Address address) {
		super();
		this.id = id;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.address = address;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}


	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();  //Use Base64 class for password Encryption
        String normalString = password;
        String encodedString = encoder.encodeToString(   // encrypt password in database field
        normalString.getBytes(StandardCharsets.UTF_8) );
        this.password = encodedString;
	}


	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}


	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}


	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
