package com.myQueue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		q.displayQueue();
		System.out.println("Queue size : " + q.size());
		
		System.out.println("\nRemoved : " + q.remove());
		
		q.displayQueue();
		System.out.println("Queue size : " + q.size());
	}
}
