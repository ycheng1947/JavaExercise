package com.exercise.yc.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args){
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i = 0;i<5;i++){
		executor.execute(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread());
				
			}});
		}
		Executors.newCachedThreadPool().execute(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread());
				
			}});
	}
}
