package com.exercise.yc.threadInteract;

/**
 * 
 * @author YC
 *
 *        调用另一个线程的输出结果
 */
public class ThreadA {

	public static void main(String[] args) {

		ThreadB tb = new ThreadB();
		tb.start();

		synchronized (tb) {
			System.out.println("等待对象tb完成计算。。。。。。");
			try {
				tb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("tb 计算的结果是： " + tb.total);
		}

	}
}
