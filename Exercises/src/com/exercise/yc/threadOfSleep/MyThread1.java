package com.exercise.yc.threadOfSleep;

public class MyThread1 extends Thread {

	public void run(){
		
		for(int i =0;i<3;i++){
			System.out.println("Thread 1 �� "+i+" ��ִ��");
			
			// ֻ������޶ȵ�Ӱ���߳�ִ�����򣬲���������ȷ���ơ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
