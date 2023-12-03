package com.kk.ds;

public class FiveTable {

	public static void main(String[] args) {
		FiveTable.recursionPrint(5,1);
	}
	 
	public static void recursionPrint(int reapt,int baseValue) {
		if(baseValue>10) {
			return;
		}
		System.out.println("Table "+ (reapt*baseValue));
		recursionPrint(reapt,baseValue+1);
	}
}
