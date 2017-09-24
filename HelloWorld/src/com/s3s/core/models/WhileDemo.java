package com.s3s.core.models;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int year1=1;
		int year2=2;
		int year3=3;
		int year4=4;
		int year5=5;
		int AcademicYear;
		String name;
		Scanner user_input=new Scanner(System.in);
		
		while(true){
			System.out.println("Enter year of your college");
			AcademicYear=user_input.nextInt();
			
		switch(AcademicYear){
		case 1:
			if(AcademicYear==year1){
				System.out.println("You are a freshman");
			
			}
			break;
		case 2:
			if(AcademicYear==year2){
				System.out.println("You are a shophmore");
			}
			break;
		case 3:
			if(AcademicYear==year3){
				System.out.println("You are a juniour");
			}
			break;
		case 4:
			if(AcademicYear==year4){
				System.out.println("You are a Seniour");
			}
			break;
			
		case 5:
			if(AcademicYear==year5){
				System.out.println("You are a Graduate");
			}
			break;
		default:
			System.out.println("Not valid year");
			
		}
		}
		
		
	}

}
