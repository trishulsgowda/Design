package com.mt;

public class ObjectLevelVsClassLevelLockDemo {

	public static void main(String[] args) {
		ObjectLevelVsClassLevelLock st = new ObjectLevelVsClassLevelLock();
		Thread t2 = new Thread(new TwosThread()); t2.setName("Twos Thread");
		Thread t5 = new Thread(new FivesThread(st)); t5.setName("Fives Thread");
		Thread t10 = new Thread(new TensThread(st)); t10.setName("Tens Thread");
		
		t2.start();
		t5.start();
		t10.start();
	}
}

class TwosThread implements Runnable{
	@Override
	public void run() {
		ObjectLevelVsClassLevelLock.printTwosTable();
	}
}

class FivesThread implements Runnable{
	ObjectLevelVsClassLevelLock st = null;
	public FivesThread(ObjectLevelVsClassLevelLock st){
		this.st = st;
	}
	@Override
	public void run() {
		st.printFivesTable();
	}
}

class TensThread implements Runnable{
	ObjectLevelVsClassLevelLock st = null;
	public TensThread(ObjectLevelVsClassLevelLock st){
		this.st = st;
	}
	@Override
	public void run() {
		st.printTensTable();
	}
}
