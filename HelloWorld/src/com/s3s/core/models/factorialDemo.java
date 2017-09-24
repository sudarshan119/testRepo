package com.s3s.core.models;

import java.util.Scanner;

public class factorialDemo {
	
	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter size: ");
		int num=user_input.nextInt();
		
		int fact=1;
		for(int i=1;i<=num ;i++){
			fact*=i;		
			}
		System.out.println(fact);
		
	}

}
