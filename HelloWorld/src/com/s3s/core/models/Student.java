package com.s3s.core.models;

public class Student {
	int ID;
	String Name;
	String Section;

	public Student(int a) {
		ID = a;
	}
	
	public Student(int a, String b) {
		ID = a;
		Name = b;
	}

	public Student(int a, String b, String c) {
		ID = a;
		Name = b;
		Section = c;
	}

	void display1() {
		System.out.println("Student Id:" + ID);

	}

	void display2() {
		System.out.println("Student Id:" + ID);
		System.out.println("Student Name:" + Name);

	}

	void display3() {
		System.out.println("Student Id:" + ID);
		System.out.println("Student Name:" + Name);
		System.out.println("Student Section:" + Section);
	}

	public static void main(String[] args) {

		Student object = new Student(16788, "Gary", "ABC11");

		object.display1();
		System.out.println('\n');
		object.display2();
		System.out.println('\n');
		object.display3();
	}
}
