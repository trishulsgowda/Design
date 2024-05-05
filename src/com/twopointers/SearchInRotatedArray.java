package com.twopointers;

import java.util.ArrayList;
import java.util.List;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list.add(23);list.add(31);list.add(33);list.add(1);list.add(2);list.add(3);list.add(4);
		
		list.add(6);list.add(7);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		System.out.println(search(list, 3));
	}

	private static int search(List<Integer> list, int target) {
		int low = 0;
		int high = list.size()-1;
		
		while(low <= high){
			
			int middle = (low + high )/2;
			
			if(target == list.get(middle)) return target;
			
			if(list.get(low) < list.get(middle)){
				if(target >= list.get(low) && target <= list.get(middle)){
					high = middle -1;
				}else{
					low = middle + 1;
				}
			}else{
				if(target >= list.get(middle)  && target <= list.get(high)){
					low = middle + 1;
				}else{
					high = middle -1;
				}
			}
			
		}
		
		return -1;
	}
}
