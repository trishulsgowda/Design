package com.LatchDemo;

import java.util.concurrent.CountDownLatch;

public class Service3 implements Runnable{
	
	private CountDownLatch latch;
	
	public Service3(CountDownLatch latch){
		this.latch = latch;
	}

	@Override
	public void run() {

		System.out.println("Service 3 is getting started...");
		try {
			Thread.sleep(5000);
			System.out.println("Service 3 is started.");
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
