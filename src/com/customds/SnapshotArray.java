package com.customds;

import java.util.*;


class SnapshotArray {  
  
  int snapid = -1;
  int[] arr;
  Map<Integer, int[]> map = new HashMap<>();
    // Constructor
    public SnapshotArray(int length) {
      arr = new int[length];
    }

    // Function setValue sets the value at a given index idx to val.
    public void setValue(int idx, int state) {
      arr[idx] = state;
    }

    // This function takes no parameters and returns the snapid.
    // snapid is the number of times that the snapshot() function was called minus 1.
    public int snapshot() {
      snapid = snapid + 1;
      map.put(snapid, Arrays.copyOf(arr, arr.length));
      return snapid;
    }

    // Function getValue returns the value at the index idx with the given snapid.
    public int getValue(int idx, int snapshotId1) {
      
      int res[] = map.get(snapshotId1); 
    	
      return res[idx];
    }
}
