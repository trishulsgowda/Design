package com.myQueue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		q.displayQueue();
		System.out.println("\nQueue size : " + q.size());
		
		q.add(6);
		
		q.displayQueue();
		System.out.println("\nQueue size : " + q.size());
		
		q.remove();
		
		q.add(6);
		q.displayQueue();
		System.out.println("\nQueue size : " + q.size());
		
	}
}
