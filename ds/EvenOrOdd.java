package com.kk.ds;

public class EvenOrOdd {

	public static void main(String[] args) {
		EvenOrOdd.checkEven(9);
		System.out.println(EvenOrOdd.checkEven1(4));
	}
	
	public static void checkEven(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	public static boolean checkEven1(int num) {
		return num%2==0?true:false;
	}
}
