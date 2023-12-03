package com.kk.graph;

public class MatrixEx {
	public static void main(String[] args) {
		int grap[][]={ { 1, 2,3 }, 
						{ 3, 4 ,5}
					};
		for (int i = 0; i < grap.length; i++) {
			for (int j = 0; j < grap.length; j++) {
				System.out.print(" " +grap[i][j]);
			}
			System.out.println("");
		}
		System.out.println(grap.length);
		System.out.println(grap[0].length);
	}
}
