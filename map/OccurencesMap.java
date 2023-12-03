package com.kk.map;

import java.util.HashMap;
import java.util.Map;

public class OccurencesMap {
	public static void main(String[] args) {
		int arr[]= {1,2,1,1,3,2};
		Map<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],(map.get(arr[i])+1));
			}else {
				map.put(arr[i], 1);
			}
		}
		printMap(arr,map);
		/*map.forEach((k,v)->{
			System.out.println("key : "+k+  ", value : "+v);
		});*/
		//System.out.println(map);
	}

	private static void printMap(int[] arr, Map<Integer, Integer> map) {
		for (int i = 0; i < arr.length-1; i++) {
			if(map.get(arr[i]) != -1) {
				System.out.println(arr[i]+"  "+map.get(arr[i]));
			}else {
				arr[i]= -1;
			}
		}
	}
	
}
