package com.s3s.core.models;

/**
 * This class represents the instance for customer
 * @author karki
 *
 */
public class Customer {
	//alt shift j
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setFirstName("Messi");
		c.setLastName("Karki");
		c.setEmail("Messi@gmail.com");
		c.setAddress("Nepal");
		c.setAge("10");
		
		
		System.out.println(c);
			
	}

}
