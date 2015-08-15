package com.exercise.yc.thread;

public class MutilThread extends Thread {

	public int i = 0;

	public void run() {

		for (int i = 0; i < 100; i++) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "," + Thread.currentThread());
		}
	}

}