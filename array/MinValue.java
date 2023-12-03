package com.kk.array;

import java.util.Arrays;
import java.util.List;

public class MinValue {
	public static void main(String[] args) {
		MinValue.minValue(Arrays.asList(44,2,25,36,88,95,11,4));
	}

	private static void minValue(List<Integer> asList) {
		 int min=asList.get(0);
		 for (int i = 1; i < asList.size(); i++) {
			 if(asList.get(i)<min) {
				 min=asList.get(i);
			 }
		}
		 System.out.println("Min Value : "+min);
		
	}
}
