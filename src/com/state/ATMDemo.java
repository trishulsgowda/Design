package com.state;

public class ATMDemo {

	public static void main(String[] args) {
		ATM atm = new ATM(100);
		atm.login();
		atm.showBalance();
		atm.selectMenuOption();
		atm.withdraw();
		
		
		atm.login();
		atm.selectMenuOption();
		atm.withdraw();
		
	}
}
