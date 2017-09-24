package com.s3s.core.Threads;

public class MultiThreading extends Thread {
	public void run(){
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread Executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading a = new MultiThreading();
		MultiThreading b = new MultiThreading();
		a.start();
		b.start();
	}

}
