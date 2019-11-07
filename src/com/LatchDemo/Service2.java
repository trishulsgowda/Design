package com.LatchDemo;

import java.util.concurrent.CountDownLatch;

public class Service2 implements Runnable{

private CountDownLatch latch;
	
	public Service2(CountDownLatch latch){
		this.latch = latch;
	}
	
	@Override
	public void run() {

		System.out.println("Service 2 is getting started...");
		try {
			Thread.sleep(5000);
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Service 2 is started.");
	}
}
