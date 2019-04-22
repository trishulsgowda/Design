package com.state;

public class ATM {

	State readyState;
	State loggedInState;
	State withdrawalState;
	State noCashState;
	
	double availableCash = 0.0;
	State currentState;
	
	public ATM(double availableCash){
		this.availableCash = availableCash;
		readyState = new ReadyState(this);
		loggedInState = new LoggedInState(this);
		withdrawalState = new WithdrawalState(this);
		noCashState = new NoCashState(this);
		if(this.availableCash > 0)
		currentState = readyState;
	}
	
	public void login(){
		currentState.login();
	}
	
	public void withdraw(){
		currentState.withdraw();
	}
	
	public void selectMenuOption(){
		currentState.selectMenuOption();
	}
	
	public void showBalance() {
		currentState.showBalance();
	}
	
	public void setState(State state){
		currentState = state;
	}
}
