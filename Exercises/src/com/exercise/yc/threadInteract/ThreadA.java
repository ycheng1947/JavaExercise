package com.exercise.yc.threadInteract;

/**
 * 
 * @author YC
 *
 *        ������һ���̵߳�������
 */
public class ThreadA {

	public static void main(String[] args) {

		ThreadB tb = new ThreadB();
		tb.start();

		synchronized (tb) {
			System.out.println("�ȴ�����tb��ɼ��㡣����������");
			try {
				tb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("tb ����Ľ���ǣ� " + tb.total);
		}

	}
}
