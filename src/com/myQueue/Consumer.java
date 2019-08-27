package com.myQueue;

public class Consumer implements Runnable {

	Queue q;
	
	Consumer(Queue q){
		this.q = q;
	}
	
	@Override
	public void run() {
				removeFromQueue();
	}
	
	public void removeFromQueue(){
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				q.remove();
			}
	}
}
