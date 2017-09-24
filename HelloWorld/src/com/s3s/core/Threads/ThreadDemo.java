package com.s3s.core.Threads;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSynchronization ts = new ThreadSynchronization();
		Thread1 v1=new Thread1(ts);
		Thread2 v2=new Thread2(ts);
		v1.run();
		v2.run();

	}

}
