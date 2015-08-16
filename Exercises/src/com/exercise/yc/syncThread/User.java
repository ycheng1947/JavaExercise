package com.exercise.yc.syncThread;

public class User {

	private String userName;
	private int cash;

	public synchronized void oper(int x) {

		try {
			Thread.sleep(1000);
			this.cash += x;

			System.out.println("The current Thread "
					+ Thread.currentThread().getName() + "运行结果，增加" + x
					+ " ,当前余额是： " + cash);
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
