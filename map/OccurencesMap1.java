package com.kk.map;

import java.util.HashMap;
import java.util.Map;

public class OccurencesMap1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 1, 3, 2 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i]) + 1));
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) != -1) {
				System.out.println(arr[i] + "  " + map.get(arr[i]));
			}
			map.put(arr[i], -1);
		}
	}
}
