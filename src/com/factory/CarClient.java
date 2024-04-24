package com.factory;

public class CarClient {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
		
		ElectricCar c2 = new ElectricCar();
		c2.drive();
		
		LatestCar c3 = new LatestCar();
		c3.drive();
	}
}
