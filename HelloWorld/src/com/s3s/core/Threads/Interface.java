package com.s3s.core.Threads;

public class Interface implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface a =new Interface();
		Thread b=new Thread(a);
		b.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Executed....");
	}

}
