package com.advancedsorting;

import java.util.Arrays;

public class FindCorruptPair{
	   public static int[] findCorruptPair(int[] nums) {
	      
	      int i =0;
	      int len = nums.length;
	      
	      while(i < len){
	        if(i == nums[i] -1){
	          i++;
	        }else{
	          if(nums[i] != nums[nums[i]-1]){
	            swap(nums, i, nums[i]-1);
	          }else{
	            i++;
	          }
	        }
	      }
	      
	      Arrays.stream(nums).forEach(n -> System.out.print(n));
	      
	      for(int j=0; j<len; j++){
	        if(nums[j] - 1 != j)
	          return new int[]{j+1, nums[j]}; 
	      }
	      return new int[]{0, 0};
	   }
	   
	   public static void swap(int[] arr, int i, int j){
	     int a = arr[i];
	     arr[i] = arr[j];
	     arr[j] = a;
	   }
	}
