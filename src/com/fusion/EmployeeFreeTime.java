package com.fusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class EmployeeFreeTime {

	public static void main(String[] args) {
		
		List<List<Interval>> intervals = Arrays.asList(
                Arrays.asList(new Interval(1, 2), new Interval(5, 6)),
                Arrays.asList(new Interval(1, 3)),
                Arrays.asList(new Interval(4, 10))
            );
		
		employeeFreeTime(intervals);
	}
	
	public static List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
		
		PriorityQueue<Interval> heap = new PriorityQueue<>((a,b) -> a.start - b.start);
		List<Interval> result = new ArrayList<>();
		
		for(List<Interval> intervals : schedule){
			for(Interval i : intervals){
				heap.add(i);
			}
		}
		
		int previous = schedule.get(0).get(0).start;
		
		while(!heap.isEmpty()){
			Interval i = heap.poll();
			System.out.println(i.start +","+ i.end);
			
			if(i.start > previous){
				result.add(new Interval(previous, i.start));
			}
			
			previous = Math.max(previous, i.end);
			
		}
		
		return result;
	}
}
