package com.s3s.core.models;

public class Banking {
	double balance;
	float interest;

	void deposit(double amount) {
		balance += amount;
		System.out.println("Amount " + amount + " is deposited");
		System.out.println("Total balance is" + balance);
	}

	void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("Amount " + amount + " is withdrawn");
			System.out.println("Total balance is" + balance);
		}
	}
}
