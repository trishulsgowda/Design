package com.templetemethod;

public abstract class PackingCheckList {

	final void packStuffForTrip(){
		packClothes();
		packMedicines();
		packDocuments();
		packElectronicItems();
	}

	protected void packElectronicItems() {
		System.out.println("Packed Mobile, Mobile Charger, Laptop and Charger");
	}

	abstract public void packDocuments(); 

	protected void packMedicines() {
		System.out.println("Packed all basic medicines");
	}

	protected void packClothes() {
		System.out.println("Packed Clothes");
	}
}
