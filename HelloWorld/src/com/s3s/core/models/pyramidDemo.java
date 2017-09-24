package com.s3s.core.models;

import java.util.Scanner;

public class pyramidDemo {

	public static void main(String[] args) {
		int num;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the size:");
		num=user_input.nextInt();
		//System.out.println(num);
		for(int i=0;i<num;i++){
			System.out.println();
			for(int j=i;j>0;j--){
			}
			for(int k=i;k>0;k--){
				System.out.print("#");
			}
		}
	}

}
