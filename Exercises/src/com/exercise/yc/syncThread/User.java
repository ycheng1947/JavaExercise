package com.exercise.yc.syncThread;

public class User {

	private String userName;
	private int cash;

	public synchronized void oper(int x) {

		try {
			Thread.sleep(1000);
			this.cash += x;

			System.out.println("The current Thread "
					+ Thread.currentThread().getName() + "���н��������" + x
					+ " ,��ǰ����ǣ� " + cash);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public User(String userName, int cash) {
		this.setUserName(userName);
		this.cash = cash;
	}


	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
