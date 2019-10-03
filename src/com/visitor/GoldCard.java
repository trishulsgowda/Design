package com.visitor;

public class GoldCard implements Card{

	@Override
	public String getName() {
		return "GOLD";
	}

	@Override
	public void accept(OffersVisitor v) {
		v.visitGoldCard(this);
	}
}
