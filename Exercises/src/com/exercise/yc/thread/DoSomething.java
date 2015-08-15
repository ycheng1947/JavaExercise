package com.exercise.yc.thread;

public class DoSomething implements Runnable {
	
	private String name;
	
	public DoSomething(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0;i<1000;i++){
		System.out.println(name + " : " +i);
		System.out.println(" Current Thread £º"+Thread.currentThread());
		}
	}

}
