package com.kk.array;

import java.util.HashSet;

public class FindDuplicate {
	public static void main(String[] args) {
		int a=findDuplicate(new int[] {1,2,5,4,5,5});
		System.out.println(a);
	}
	
	 public static int findDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        for(int num : nums) {
	        	//boolean b=set.add(num);
	        //	System.out.println(b);
	            if(!set.add(num)) {
	                return num;
	            }
	        }
	        return -1;
	    }
}
