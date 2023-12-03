package com.kk.map;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() == t.length()) {
			Map<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				if (map.containsKey(map.get(s.charAt(i)))) {
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				} else {
					map.put(s.charAt(i), map.get(1));
				}
			}

			for (int i = 0; i < t.length(); i++) {
				if (map.containsKey(t.charAt(i))) {
					map.remove(t.charAt(i));
				}else {
					map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				}
			}
			
			if(map.size()>0) {
				return false;
			}else{
				return true;
			}
		}
		
		
		return false;
	}
}
