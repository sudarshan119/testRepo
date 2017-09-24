package com.s3s.core.Imheritance;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountUniqueWord {
	String word;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = null;
		int totalWord;
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter String: ");
		user_input.nextLine();
		System.out.println(input);
		
		Scanner user_input2 = new Scanner(System.in);
		System.out.println("Repeat String: ");
		user_input2.nextLine();
		System.out.println(user_input2);
		
		StringTokenizer st = new StringTokenizer(input);
		totalWord=st.countTokens();
		
		System.out.println("Total words count is:"+totalWord);
		
		int count =0;
		while(st.hasMoreTokens()){
			if(user_input2.equals(st.nextToken())){
				count++;
			}
			
		}
		System.out.println("Repeated times is"+count);
	}

}
