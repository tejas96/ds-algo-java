package com.codewithtejas.interviewprep;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KFrequent {
	
	public static void findKfrequent(int arr[], int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<arr.length; i++) 
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if(o1.getKey() == o2.getKey())
					return o2.getKey() - o1.getKey();
				else {
					return o2.getValue() - o1.getValue();
				}
			}
		});
		
		for(int i = 0; i<k; i++) {
			System.out.println(list.get(i).getKey());
		}
	}
}
