package com.mt;

public class Print1And0FromTwoThreads {
	
	boolean printOdd = true;
	
	public static void main(String[] args) {
		Print1And0FromTwoThreads print1And0FromTwoThreads = new Print1And0FromTwoThreads();
		
		Thread ot = new Thread(new OddThread(print1And0FromTwoThreads));
		Thread et = new Thread(new EvenThread(print1And0FromTwoThreads));
		
		ot.start();
		et.start();
	}
	
	

	public synchronized void printOdd(){
		while(printOdd){
			try{
				Thread.sleep(1000);
				System.out.println(1);
				printOdd = false;
				wait();
			}catch(InterruptedException e){
				
			}
		}
	}
	
	public synchronized void printEven(){
		while(!printOdd){
			try{
				Thread.sleep(1000);
				System.out.println(0);
				printOdd = true;
				notify();
			}catch(InterruptedException e){
			}
		}
	}
}

class OddThread implements Runnable{
	Print1And0FromTwoThreads print1And0FromTwoThreads;
	public OddThread(Print1And0FromTwoThreads print1And0FromTwoThreads) {
		this.print1And0FromTwoThreads = print1And0FromTwoThreads;
	}
	
	public void run() {
		while(true){
			this.print1And0FromTwoThreads.printOdd();
		}
	}
}

class EvenThread implements Runnable{
	Print1And0FromTwoThreads print1And0FromTwoThreads;
	public EvenThread(Print1And0FromTwoThreads print1And0FromTwoThreads) {
		this.print1And0FromTwoThreads = print1And0FromTwoThreads;
	}
	
	public void run() {
		while(true){
			this.print1And0FromTwoThreads.printEven();
		}
	}
}
