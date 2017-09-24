package com.s3s.core.Threads;

public class ThreadSynchronization {
	synchronized void Alphabet(){
		char[] Arr={'a','b','c','d','e'};
		for(int i=0;i<Arr.length;i++){	
		System.out.println(" "+Arr[i]);
		}
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
