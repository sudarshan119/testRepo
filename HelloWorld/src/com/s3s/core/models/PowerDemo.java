package com.s3s.core.models;

import java.security.InvalidParameterException;

public class PowerDemo {
	void pow(double a, double b) throws InvalidParameterException{
		if(a<0 || b<0){
			throw new InvalidParameterException("a and b are not possitive.");
			
			//System.out.println("Invalid Expression");
		}else{
			double power=Math.pow(a, b);
			System.out.println("Final Number "+power);
		}
	}


	public static void main(String[] args) {
		
		PowerDemo p=new PowerDemo();
		p.pow(-2, 4);
	}

}
