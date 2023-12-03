package com.kk.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		//boolean flag = BinarySearch.binarySearch(Arrays.asList(1,2,3,4,5,6,7,8,9), -1);
		//System.out.println(flag);
		
		System.out.println(binary_to_decimal("111"));
		
	}

	private static boolean binarySearch(List<Integer> arr, int key) {

		int low = 0;
		int high = arr.size() - 1;
		while(low<=high) {
			int mid = (low + high) / 2;
			if (arr.get(mid) == key) {
				return true;
			} else if (arr.get(mid) > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
	
	
	public static int binary_to_decimal(String str) {
		int ans = 0;
		int base = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				ans = ans + (base * 1);
			}
			base = base * 2;
		}

		return base;
	}

}
