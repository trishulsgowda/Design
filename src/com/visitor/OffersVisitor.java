package com.visitor;

public interface OffersVisitor {
	public void visitBronzeCard(BronzeCard c);
	public void visitSilverCrad(SilverCard c);
	public void visitGoldCard(GoldCard c);
}
