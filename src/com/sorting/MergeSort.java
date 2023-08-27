package com.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		MergeSort  mergeSort = new MergeSort();
		
		int a[] = {4,7,5,1,9,2,3,6,8};
		int temp[] = new int[a.length]; // Make sure to pass temporary array in order not to create new temporary arrays
		mergeSort.mergesort(a,temp, 0,a.length-1);
		
		System.out.println(Arrays.toString(a));
	}

	private void mergesort(int[] a, int[] temp, int l, int r) {
		if(l < r){
			int mid = (l + r)/2;
			mergesort(a,temp, l, mid); // sort left part of array
			mergesort(a,temp, mid+1, r); // sort right part of array
			merge(a,temp,l,mid,r); // merge the sorted left array and sorted right array
		}
		
	}

	private void merge(int[] a, int[] temp, int l, int mid, int r) {
		
		int i=l; // temp array starts from current left 
		
		int le = mid;
		int rs = mid +1;
		
		while(l <= le && rs <= r){
			if(a[l] <= a[rs]){
				temp[i] = a[l];
				i++;
				l++;
			}else if(a[rs] <= a[l]){
				temp[i] = a[rs];
				i++;
				rs++;
			}
		}
		
		while(l <= le){
			if(a[l] <= a[le]){
				temp[i] = a[l];
				i++;
				l++;
			}
		}
		
		while(rs <= r){
			if(a[rs] <= a[r]){
				temp[i] = a[rs];
				i++;
				rs++;
			}
		}
		
		for(int j=0; j<i ; j++ ){
			a[j] = temp[j]; 
		}
	}
}
