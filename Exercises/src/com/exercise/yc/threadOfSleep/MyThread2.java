package com.exercise.yc.threadOfSleep;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<3;i++){
			System.out.println("Thread2 µÚ "+i+" ´ÎÖ´ÐÐ£¡");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
