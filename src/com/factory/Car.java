package com.factory;

public class Car {
	
	Fuel fuel;
	Transmission transmission;
	
	public Car() {
		makeCar();
	}
	
	public void makeCar() {
		this.fuel = new Fuel("Diesel");
		this.transmission = new Transmission("Manual");
	}
	

	public void drive(){
		System.out.println(String.format("Driving %s car with %s transmission", fuel.fuelType, transmission.transmissionType));
	}
}
