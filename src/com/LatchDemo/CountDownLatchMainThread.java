package com.LatchDemo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMainThread {

	public static void main(String[] args) throws InterruptedException {
		
		int numberOfServices = 3;
		
		CountDownLatch latch = new CountDownLatch(numberOfServices);
		
		Thread service1 = new Thread(new Service1(latch));
		Thread service2 = new Thread(new Service2(latch));
		Thread service3 = new Thread(new Service3(latch));
		
		service1.start();
		service2.start();
		service3.start();
		
		System.out.println("Waiting till all the services are up !!");
		latch.await();
		
		System.out.println("All services are up !! Continuing with the main thread..");
	}
}
