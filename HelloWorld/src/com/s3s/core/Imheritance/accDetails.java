package com.s3s.core.Imheritance;

public class accDetails extends savingAcc {
	double deposit;
	double withdraw;
	public accDetails(String custumerName, int accountNum, float initialBalance, float savingBalance, double deposit, double withdraw){
		super(custumerName,accountNum,initialBalance,savingBalance);
		this.deposit=deposit;
		this.withdraw=withdraw;
		System.out.println("Deposit is "+deposit);
		System.out.println("Withdraw is "+withdraw);
	}
}
