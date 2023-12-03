package com.kk.array;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

	public static void main(String[] args) {
		MaxSubArray.maxSubArray(Arrays.asList(4, 5, 6, 8, 7, 9, 2));
	}

	private static void maxSubArray(List<Integer> asList) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < asList.size(); i++) {
			if(asList.get(i)>ans) {
				ans=asList.get(i);
			}
		}
		System.out.println("Max Value :" +ans);

	}
}
