package com.exercise.yc.thread;

public class Foo {
	
	private int x =100;
	
	public Foo(int x){
		this.x=x;
	}
	
	public Foo() {
		// TODO Auto-generated constructor stub
	}

	public synchronized int getX(){
		return x;
	}
	
	public int fixX(int y){
		
		synchronized (this) {
			x = x-y ;
		}
		 
		 return x;
	}

}
