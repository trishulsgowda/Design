package com.decorator;

public class ChaiShop {

	public static void main(String[] args) {
		Chai chai = new DesiChai();
		chai.getDescription();
		System.out.println(chai.getCost());
		
		Chai masalaChai = new MasalaChaiDecorator(chai);
		masalaChai.getDescription();
		System.out.println(masalaChai.getCost());
	}
}
