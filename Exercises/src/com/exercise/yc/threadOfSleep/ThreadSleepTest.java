package com.exercise.yc.threadOfSleep;

public class ThreadSleepTest {
	
	public static void main(String[] args) {
		
//		Thread t3 = new MyThread1();
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());
		
		t1.start();
		t2.start();
	}
	
	
	

}
