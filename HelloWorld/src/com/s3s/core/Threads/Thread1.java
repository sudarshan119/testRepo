package com.s3s.core.Threads;

public class Thread1 extends Thread {
	ThreadSynchronization t;
	public Thread1(ThreadSynchronization t){
		this.t=t;
	}
	public void run(){
		t.Alphabet();
	}
	
}
