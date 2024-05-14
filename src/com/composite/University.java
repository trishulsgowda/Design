package com.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University implements College{

	List<College> affiliatedColleges;
	
	public University(List<College> affiliatedColleges) {
		if(this.affiliatedColleges == null){
			this.affiliatedColleges = new ArrayList<>();
			
			if(affiliatedColleges != null)
			this.affiliatedColleges.addAll(affiliatedColleges);
		}
	}
	
	public void addCollege(College college){
		this.affiliatedColleges.add(college);
	}
	
	@Override
	public int numberOfStudents() {
		
		int totalStudents = 0;
		
		Iterator<College> collegeIterator = this.affiliatedColleges.iterator();
		while (collegeIterator.hasNext()) {
			College col = collegeIterator.next();
			
			totalStudents += col.numberOfStudents();
		}
		
		return totalStudents;
	}

}
