package com.exercise.yc.threadInteract;

public class ThreadB extends Thread{
	 int total  ;
	public void run(){
		
		synchronized (this) {
			
			for(int i =0;i<101;i++){
				total +=i;
			}
			// Íê³É¼ÆËã
			notify();
		}
	}
}
