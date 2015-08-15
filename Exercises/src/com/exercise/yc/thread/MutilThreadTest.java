package com.exercise.yc.thread;

/**
 * 
 * @author YC
 *
 */

public class MutilThreadTest {

	public static void main(String[] args) {
		MutilThread mt1 = new MutilThread();
		MutilThread mt2 = new MutilThread();
		mt1.start();
		mt2.start();
		// System.out.println(Thread.currentThread());
	}

}
