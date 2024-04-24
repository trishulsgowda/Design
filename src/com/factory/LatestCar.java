package com.factory;

public class LatestCar extends Car {

	@Override
	public void makeCar() {
		fuel = new Fuel("Petrol");
		transmission = new Transmission("Automatic");
	}
}
