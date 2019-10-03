package com.visitor;

public class BronzeCard implements Card {

	@Override
	public String getName() {
		return "BRONZE";
	}

	@Override
	public void accept(OffersVisitor v) {
		v.visitBronzeCard(this);
	}

}
