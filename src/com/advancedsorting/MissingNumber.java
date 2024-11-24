package com.advancedsorting;

import java.util.*;
public class MissingNumber{
   public static int findMissingNumber(int[] arr) {
      
      int length = arr.length;
      int i=0;
      
      while(i < length){
        if(i != arr[i] && arr[i] < length){
          swap(i, arr[i], arr);
        }else{
          i++;
        }
      }
      
      Arrays.stream(arr).forEach(n -> System.out.print(n));
     
      for(int j=0; j<arr.length; j++){
        if(j != arr[j]) return j;
      }
      
      return length;
   }
   
   public static void swap(int i, int j, int[] arr){
     int a = arr[i];
     arr[i] = arr[j];
     arr[j] = a;
   }
}
