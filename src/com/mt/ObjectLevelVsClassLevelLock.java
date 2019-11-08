package com.mt;

public class ObjectLevelVsClassLevelLock {

	public synchronized void printTensTable(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " " + 10*i);
		}
	}
	
	public synchronized void printFivesTable(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " " + 5*i);
		}
	}
	
	public static synchronized void printTwosTable(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() + " " + 2*i);
		}
	}
}
