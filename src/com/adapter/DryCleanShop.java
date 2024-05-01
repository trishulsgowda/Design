package com.adapter;

import java.util.ArrayList;
import java.util.List;

public class DryCleanShop {

	public static void main(String[] args) {
		
		
		List<WashingMachine> washingMachines = new ArrayList<>();
		
		washingMachines.add(new LGFrontLoad());
		washingMachines.add(new LGTopLoad());
		washingMachines.add(new IFBWashingMachineAdapter(new IFBWashingMachine()));
		
		// Client code to turn on all machines at once
		// Cannot turn on IFB washing machine with below client code so we need an adapter
		for(WashingMachine wm : washingMachines){
			wm.spin();
		}
	}
}
