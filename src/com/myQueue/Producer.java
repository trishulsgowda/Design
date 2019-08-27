package com.myQueue;

public class Producer implements Runnable {

	Queue q;
	
	Producer(Queue q){
		this.q = q;
	}

	@Override
	public void run() {
		addToQueue();
	}
	
	public void addToQueue(){
		int i=1;
			while(true){
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				q.add(i);
				i++;
			}
	}
}
