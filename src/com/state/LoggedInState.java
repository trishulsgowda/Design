package com.state;

import java.util.Scanner;

public class LoggedInState implements State {

	ATM atm;

	public  LoggedInState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public void login() {
		System.out.println("Already logged in");
	}
	
	@Override
	public void selectMenuOption() {
		System.out.println("Press 1 to go for withdrawal");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		if(op ==1){
			atm.setState(new WithdrawalState(atm));
		}
	}

	@Override
	public void showBalance() {
		System.out.println("Your available balance is *****");
	}

	@Override
	public void withdraw() {
		System.out.println("Not a valid option");
	}

}
