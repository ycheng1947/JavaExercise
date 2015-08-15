package com.exercise.yc.thread;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		DoSomething ds1 = new DoSomething("Ñî³Ï");
		DoSomething ds2 = new DoSomething("Â³ÏþÙ»");
		
		Thread t1 = new Thread(ds1);
		Thread t2 = new Thread(ds2);
		
		t1.start();
		t2.start();
	}



}
