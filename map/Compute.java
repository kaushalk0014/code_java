package com.kk.map;

import java.util.HashMap;
import java.util.Map;

public class Compute {
	public String isSubset(long a1[], long a2[], long n, long m) {
		Map<Long, Long> map = new HashMap<>();
		for (int i = 0; i < n ; i++) {
			if (map.containsKey(a1[i])) {
				map.put(a1[i], (map.get(a1[i]) + 1));
			} else {
				map.put(a1[i], 1l);
			}
		}

		for (int i = 0; i < m ; i++) {
			if (!map.containsKey(a2[i])||map.get(a2[i])==0) {
				return "No";
			}else {
				 map.put(a2[i], map.get(a2[i]) - 1l);
			}
		}
		return "Yes";

	}
}
