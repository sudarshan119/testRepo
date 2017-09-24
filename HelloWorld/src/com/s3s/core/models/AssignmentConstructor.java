package com.s3s.core.models;

public class AssignmentConstructor {
	int ID;
	String name;
	String address;

	public AssignmentConstructor() {
		System.out.println("I am a Default constructor");
	}

	public AssignmentConstructor(int ID) {

		ID = this.ID;
		System.out.println("I am  parameterized constructor with one parameter " + ID);
	}

	public AssignmentConstructor(int ID, String name) {

		ID = ID;
		name = name;
		System.out.println("I am  parameterized constructor with one parameter " + ID  + " " + name);
	}

	void display() {
		System.out.println(ID + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentConstructor ac = new AssignmentConstructor(9, "ee");
		ac.display();

	}

}
