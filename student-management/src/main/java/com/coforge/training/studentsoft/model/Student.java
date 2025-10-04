package com.coforge.training.studentsoft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Lombok is an open-source library (basically a standalone jar) capable of 
//* doing magic
//*  in automating the boilerplate code generation for any java class. 
//*  So if Lombok is in the classpath, it can quickly get rid of all the getters & setters 
//*  methods, class constructors, hashcode and equals methods and many more by adding a 
//*  couple of annotations to the class.
//*  
//*  Integrate Lombok to STS . Help --> Install new Software and add following url
//*  
//*  https://projectlombok.org/p2
//*/
//
///*@Data  bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and 
//@RequiredArgsConstructor together*/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	private int rollNo;
    private String firstName;
    private String lastName;
    private String gender;
    private String course;
    
    
	/**
	 * 
	 */
	public Student() {
		super();
	}
	
	
	/**
	 * @param rollNo
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param course
	 */
	public Student(int rollNo, String firstName, String lastName, String gender, String course) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.course = course;
	}


	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
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
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
    
    
}
