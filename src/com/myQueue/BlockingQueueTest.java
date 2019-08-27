package com.myQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		Thread consumer = new Thread(new Consumer(q));
		Thread producer = new Thread(new Producer(q));
		consumer.start();
		producer.start();
		
	}
}
