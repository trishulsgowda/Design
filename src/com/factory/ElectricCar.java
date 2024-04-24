package com.factory;

public class ElectricCar extends Car{

	@Override
	public void makeCar() {
		// TODO Auto-generated method stub
		super.makeCar();
		this.fuel = new Fuel("Electric");
	}
}
