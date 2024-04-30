package com.strategy;

public class SportMode implements DrivingMode{

	@Override
	public void drive() {
		System.out.println("Driving the car is sports mode, REVVV!!!");
	}

}
