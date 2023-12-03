package com.kk.array;

public class MoveZero {

	public static void main(String[] args) {
		int arr[] = { 4, 0, 0, 9, 0, 0, 0, 2 };
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp=nums[count];
				nums[count] = nums[i];
				nums[i]=temp;
				count++;
			}
		}
//		while (count < nums.length) {
//			nums[count] = 0;
//			count++;
//		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
