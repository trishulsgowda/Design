package com.state;

public class ReadyState implements State {
	
	ATM atm;
	
	public  ReadyState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public void login() {
		atm.setState(new LoggedInState(atm));
		System.out.println("You're now logged in");
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
