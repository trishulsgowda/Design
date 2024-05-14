package com.composite;

public class IndependentCollege implements College {

	String name;
	int numberOfStudents;
	
	public IndependentCollege(String name, int numberOfStudents) {
		super();
		this.name = name;
		this.numberOfStudents = numberOfStudents;
	}

	@Override
	public int numberOfStudents() {
		return this.numberOfStudents;
	}

}
