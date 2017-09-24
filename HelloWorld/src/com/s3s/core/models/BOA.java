package com.s3s.core.models;

public class BOA extends Banking{
	public BOA(double amount){
		balance+=amount;
		System.out.println("Total balance initially"+balance);
	}
	public static void main(String[] args) {
		BOA object=new BOA(25000);
		object.deposit(1000);
		object.withdraw(9000);
	}

}
