package com.visitor;

public class Runner {

	public static void main(String[] args) {
		MovieOffers movie = new MovieOffers();
		
		BronzeCard card = new BronzeCard();
		card.accept(movie);
	}
}
