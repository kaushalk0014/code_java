package com.kk.recurson;

public class PrintFive {

	public static void main(String[] args) {
		printFive(5);
	}
	//Out put is 1,2,3,4,5
	private static void printFive(int n) {
		 if(n<=0) {
			 return;
		 }
		 printFive(n-1);
		 System.out.print(" "+n);
		
	}
}
