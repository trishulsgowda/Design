package com.state;

import java.util.Scanner;

public class WithdrawalState implements State {

	ATM atm;

	public  WithdrawalState(ATM atm) {
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
		System.out.println("Enter the amount to be withdrawn");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		if(atm.availableCash >= amount){
			atm.availableCash = atm.availableCash - amount;
			System.out.println("Please collect the cash below");
			atm.setState(new ReadyState(atm));
		}else{
			System.out.println("No cash in ATM");
			atm.setState(new NoCashState(atm));
		}
	}

}
