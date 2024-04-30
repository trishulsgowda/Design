package com.strategy;

public class Driver {
	
	DrivingMode drivingMode;

	public Driver(DrivingMode dm) {
		// TODO Auto-generated constructor stub
		drivingMode = dm;
	}
	
	public void drive(){
		drivingMode.drive();
	}
	
	public void toggleDrivingMode(DrivingMode dm){
		drivingMode = dm;
	}
}
