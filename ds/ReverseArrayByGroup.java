package com.kk.ds;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayByGroup {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		ReverseArrayByGroup.reverseArrayByGroup(arr,k);
	}

	private static void reverseArrayByGroup(int[] arr, int k) {
		
		for (int i = 0; i < arr.length; i=i+k) {
			int low=i;
			int tt=i+k-1;
			int high=tt>=arr.length?(arr.length-1):i+k-1;
			//System.out.println(high);
			while (low<high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;high--;
			}
		}
		 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	 
}
