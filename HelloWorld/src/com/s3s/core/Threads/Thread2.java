package com.s3s.core.Threads;

public class Thread2 extends Thread {
	ThreadSynchronization t;
	public Thread2(ThreadSynchronization t){
		 this.t=t;
		}
	public void run(){
		t.Alphabet();
	}
}
