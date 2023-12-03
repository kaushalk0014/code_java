package com.kk.ds;

public class SimpleApps {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		SimpleApps.recursionPrint(5);
	}

	public static void recursionPrint(int reapt) {
		if(reapt<1) {
			return;
		}
		System.out.println("Kaushal "+ reapt);
		recursionPrint(reapt-1);
	}
}
