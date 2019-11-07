package com.LatchDemo;

import java.util.concurrent.CountDownLatch;

public class Service1 implements Runnable {
	
private CountDownLatch latch;
	
	public Service1(CountDownLatch latch){
		this.latch = latch;
	}

	@Override
	public void run() {

		System.out.println("Service 1 is getting started...");
		try {
			Thread.sleep(5000);
			System.out.println("Service 1 is started.");
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
