package com.java8;

public class EvolutionOfLambda {

	public static void main(String[] args) {
		
		/*Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("You know nothing ! John Snow");
			}
		});*/
		
		Thread th = new Thread(() -> System.out.println("You know nothing ! John Snow"));
		
		th.start();
	}
}
