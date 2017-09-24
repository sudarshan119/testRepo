package com.s3s.core.models;

public class StudentDemo {
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
		return "StudentDemo [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo student1 = new StudentDemo();
		student1.setFirstName("Gerrad");
		student1.setLastName("Green");
		student1.setAddress("Virginia");
		student1.setEmail("green@gmail.com");
		student1.setAge("10");
		System.out.println(student1);

	}

}
