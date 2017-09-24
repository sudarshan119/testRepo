package com.s3s.core.ExceptionHanding;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=4;
		int num;
		//num=a/b;
		try{
			num=b/a;
			System.out.println(num);
		}catch(Exception e){
			System.out.println("Divede by exception");
		}
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter num= ");
		
		try{
			num=user_input.nextInt();
			System.out.println("Enter Number: "+num);
		}catch(Exception e){
			System.out.println("Not a integer");
		}
	}

}
