package com.composite;

public class CompositeClient {

	public static void main(String[] args) {
		
		College bmsit = new IndependentCollege("BMSIT", 400);
		College bmsce = new IndependentCollege("BMSCE", 560);
		College bmsca = new IndependentCollege("BMSCA", 60);
		
		University bmsUniversity = new University(null);
		bmsUniversity.addCollege(bmsit);
		bmsUniversity.addCollege(bmsce);
		bmsUniversity.addCollege(bmsca);
		
		System.out.println(bmsUniversity.numberOfStudents());
		System.out.println(bmsit.numberOfStudents());
	}
}
