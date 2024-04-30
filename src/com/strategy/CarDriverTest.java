package com.strategy;

public class CarDriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver(new SportMode());
		driver.drive();
		
		//changing the strategy dynamically
		driver.toggleDrivingMode(new CityMode());
		driver.drive();
	}
}
