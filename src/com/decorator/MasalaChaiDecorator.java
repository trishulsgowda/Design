package com.decorator;

public class MasalaChaiDecorator extends ChaiDecorator {
	
	Chai chai;
	
	public MasalaChaiDecorator(Chai chai) {
		this.chai = chai;
	}

	@Override
	public void getDescription() {
		System.out.println("Desi Chai with indegenious spices");
	}

	@Override
	public double getCost() {
		return chai.getCost() + 20.00;
	}

}
