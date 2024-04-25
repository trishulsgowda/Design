package com.decorator;

public class DesiChai implements Chai{

	@Override
	public void getDescription() {
		System.out.println("Desi Chai with thick milk and added sugar");
	}

	@Override
	public double getCost() {
		return cost;
	}

	
}
