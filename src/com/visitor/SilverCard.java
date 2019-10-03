package com.visitor;

public class SilverCard implements Card{

	@Override
	public String getName() {
		return "SILVER";
	}

	@Override
	public void accept(OffersVisitor v) {
		v.visitSilverCrad(this);
	}
}
