package com.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RescueBoats {
	public static int rescueBoats(int[] people, int limit) {

		int left = 0;
		int right = people.length - 1;
		int boats = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i : people) {
			list.add(i);
		}

		list.sort(Collections.reverseOrder());

		while (left <= right) {
			if (list.get(left) + list.get(right) > limit) {
				boats++;
				left++;
			}else if (list.get(left) + list.get(right) == limit) {
				boats++;
				left++;
				right--;
			}

		}

		return boats;
	}

	public static void main(String[] args) {
		int[] people = {5,4,3,3,2,1};
		int limit = 5;
		
		System.out.println(rescueBoats(people, limit));
	}
}
