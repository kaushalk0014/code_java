package com.kk.ds;

public class ReverseArrayByIndex {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		arr[3] = 6;
		arr[4] = 7;
		arr[5] = 8;
		ReverseArrayByIndex.reverseArrayByIndex(4, arr);
	}

	private static void reverseArrayByIndex(int index, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input Array : " + arr[i]);
		}

		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		System.out.println("Reverse Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
