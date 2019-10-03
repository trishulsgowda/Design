package com.visitor;

public interface Card {
	public String getName();
	public void accept(OffersVisitor v);
}
