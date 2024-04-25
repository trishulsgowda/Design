package com.templetemethod;

public class TripPackingClient {

	
	public static void main(String[] args) {
		DomesticTrip dTrip = new DomesticTrip();
		dTrip.packStuffForTrip();
		
		
		InternationalTrip internationalTrip = new InternationalTrip();
		internationalTrip.packStuffForTrip();
	}
}
