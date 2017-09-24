package com.s3s.core.models;

import java.util.Scanner;

public class AssignLoopDemo {

	public static void main(String[] args) {
		int age;
		String name;
		Scanner user_input = new Scanner(System.in); // to input from user
		System.out.println("Enter your Name as a string");
		System.out.println('\n');
		name = user_input.next();

		System.out.println("Enter your age");
		System.out.println('\n');
		age = user_input.nextInt();
		/*
		if (age < 16) {
			System.out.println("You cannot have Driving Liscence");
			System.out.println("You are not allowed to Drink alcohal");
			System.out.println("You are not allowed to vote");
		} else if (age > 16 && age < 18) {
			System.out.println("You are not allowed to vote");
			System.out.println("You are not allowed to Drink Alcohal");
		} else if (age > 18 && age < 21) {
			System.out.println("You are not allowed to Drink alcohal");
		} else{
			System.out.println("You have all legal right");
		}
		*/
		
		if(age<21){
			System.out.println("You are not allowed to Drink Alcohal");
			if(age<18){
				System.out.println("You are not allowed to vote");
				if(age<16){
					System.out.println("You cannot have Driving Liscence");
				}
			}
			
		}
		else{
			System.out.println("You have all legal right");
		}
	}// System.out.println();
	
}
