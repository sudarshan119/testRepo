package com.s3s.core.Imheritance;

public class Account {

	String custumerName;
	int accountNum;
	public Account(String custumerName,int accountNum){
		this.custumerName=custumerName;
		this.accountNum=accountNum;
		System.out.println("Custumer Name"+custumerName);
		System.out.println("Accoutn Num"+accountNum);
	}

}
