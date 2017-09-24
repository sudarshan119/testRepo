package com.s3s.core.Imheritance;

public class savingAcc extends Account {
	float initialBalance;
	float savingBalance;
	public savingAcc(String custumerName, int accountNum, float initialBalance, float savingBalance){
		super(custumerName,accountNum);
		this.initialBalance=initialBalance;
		this.savingBalance=savingBalance;
		System.out.println("Initial Balance "+initialBalance);
		System.out.println("Saving Balance "+savingBalance);
	}
}
