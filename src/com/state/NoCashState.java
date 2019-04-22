package com.state;

public class NoCashState implements State {

	ATM atm;

	public  NoCashState(ATM atm) {
		this.atm = atm;
	}
	
	@Override
	public void login() {
		System.out.println("Not a valid option");
	}
	
	@Override
	public void selectMenuOption() {
		System.out.println("Not a valid option");
	}

	@Override
	public void showBalance() {
		System.out.println("Not a valid option");
	}

	@Override
	public void withdraw() {
		System.out.println("Not a valid option");
	}

}
