package com.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		
		int a[] = {4,2,3,7,1,6};
		
		qs.sort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public void sort(int a[], int l, int r){
		if(l < r){
			int pivot = partition(a, l, r);
			sort(a, l, pivot-1);
			sort(a, pivot+1, r);
		}
	}
	
	public int partition(int a[], int l, int r){
		
		int low = l;
		int p = a[low];
		
		while(l < r){
			while(a[l] <= p && l < a.length-1){
				l++;
			}
			while(a[r] > p && r > 0){
				r--;
			}
			if(l<r){
				swap(a,l,r);
			}
		}
		
		a[low] = a[r];
		a[r] = p;
		
		return r;
	}

	private void swap(int[] a, int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
}
