package com.kk.recurson;

import java.util.ArrayList;
import java.util.List;

public class Solve {
	//243
	
	static int bar(int x, int y) {
		
		if (y == 0)
			return 0;
		return (x + bar(x, y - 1));
	}

	static int foo(int x, int y) {
		if (y == 0)
			return 1;
		return bar(x, foo(x, y - 1));
	}

	public static void main(String[] args) {
		System.out.println(foo(3, 5));
	}

}
