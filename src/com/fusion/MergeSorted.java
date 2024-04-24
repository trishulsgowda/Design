package com.fusion;

import java.util.Arrays;

public class MergeSorted {

	
	public static void main(String[] args) {
		//int[] a = {2,4,6,11,15,0,0,0};
		//int[] b = {1,8,9};
		
		//int[] a = {1,2,3,0,0,0};
		//int[] b = {4,5,6};
		
		int[] a = {6,7,8,9,10,0,0,0,0,0};
		int[] b = {1,2,3,4,5};
		
		sort(a,b);
	}

	private static void sort(int[] nums1, int[] nums2) {
		int p2 = nums2.length - 1;
		int p1 = nums1.length - nums2.length -1;
		int p = nums1.length - 1;
		
		while (p >= 0) {

			if (p == p1)
				break;

			if (p1 < 0) {
				nums1[p] = nums2[p2];
				p2--;
				p--;
				continue;
			}

			if (nums1[p1] > nums2[p2]) {
				nums1[p] = nums1[p1];
				p--;
				p1--;
			} else {
				nums1[p] = nums2[p2];
				p--;
				p2--;
			}
		}
		
		System.out.println(Arrays.toString(nums1));
	}
}
