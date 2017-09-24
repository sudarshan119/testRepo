package com.s3s.core.Imheritance;

public class Polymorphism {
	void add(int a, int b){
		int num;
		num=a+b;
		System.out.println("int add invoked "+num);
	}
	void add(float a, float b){
		float num;
		num=a+b;
		System.out.println("float add invoked "+num);
	}
	public static void main(String[] args) {
		Polymorphism o1=new Polymorphism();
		o1.add(10, 18);
		o1.add(10.98f, 18.99f);
	}

}
