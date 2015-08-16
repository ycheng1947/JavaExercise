package com.exercise.yc.threadOfSleep;

public class MyThread1 extends Thread {

	public void run(){
		
		for(int i =0;i<3;i++){
			System.out.println("Thread 1 第 "+i+" 次执行");
			
			// 只能最大限度的影响线程执行秩序，不能做到精确控制。
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
