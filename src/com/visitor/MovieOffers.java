package com.visitor;

public class MovieOffers implements OffersVisitor {

	@Override
	public void visitBronzeCard(BronzeCard c) {
		System.out.println("Bronze card has 5% offer on movies");
	}

	@Override
	public void visitSilverCrad(SilverCard c) {
		System.out.println("Bronze card has 10% offer on movies");
	}

	@Override
	public void visitGoldCard(GoldCard c) {
		System.out.println("Bronze card has 15% offer on movies");
	}

}
