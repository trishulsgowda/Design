package com.adapter;

public class IFBWashingMachineAdapter implements WashingMachine{

	IFBWashingMachine IFBWashingMachine;
	
	public IFBWashingMachineAdapter(com.adapter.IFBWashingMachine iFBWashingMachine) {
		super();
		IFBWashingMachine = iFBWashingMachine;
	}

	@Override
	public void spin() {
		this.IFBWashingMachine.rotateWashingDrum();
	}

}
