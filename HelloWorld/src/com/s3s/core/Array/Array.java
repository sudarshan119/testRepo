package com.s3s.core.Array;

import java.util.Scanner;

public class Array {
	void largestSmallest(){
		int n;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter Number of Element in Array");
		n=user_input.nextInt();
		System.out.println(n);
		
		int[] num=new int[n];
		System.out.println("Enter the element of Array");
		int sum=0;
		String number="";
		for(int i=0; i<n;i++){
			num[i]=user_input.nextInt();
			number=number+num[i]+" ";
			
			//System.out.println(number);
			sum=sum+num[i];
		}
		int smallest=num[0];
		int largest=num[0];
		
		for(int i=0;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			//	System.out.println("Largest= "+largest);
				
			}else if(num[i]<smallest){
				smallest=num[i];
				//System.out.println("Smallest= "+smallest);
			}
			
		}
		int minimal = sum - smallest;
		int maximal = sum - largest;
		System.out.println(num);
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Minimal Sum is: " + minimal);
		System.out.println("Maximal Sum is: " + maximal);
		
	}
	public static void main(String[] args) {
		Array a1=new Array();
		a1.largestSmallest();
	}

}
