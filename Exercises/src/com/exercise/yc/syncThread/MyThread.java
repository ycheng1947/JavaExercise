package com.exercise.yc.syncThread;

public class MyThread extends Thread{

	private User u;
	private int cash;
	
	public MyThread(String name,User u,int cash){
		super(name);
		this.cash =cash;
		this.u=u;
	
	}
	
	public void run(){
		u.oper(cash);
	}
}
