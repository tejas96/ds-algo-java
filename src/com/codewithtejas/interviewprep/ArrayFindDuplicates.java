package com.codewithtejas.interviewprep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayFindDuplicates {

	public static Integer[] findDuplicatesNaiveApproach(int []arr) {
		long start = System.currentTimeMillis();
		List<Integer> output = new ArrayList<>();
		
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					output.add(arr[i]);
					break;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Naive Approach -> "+ (end-start) + " ms");
		return output.toArray(new Integer[output.size()]);
	}
	
	public static Integer[] findDuplicatesSmartApproach(int []arr) {
		long start = System.currentTimeMillis();
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for(int i = 0; i<arr.length; i++) {
			if(unique.contains(arr[i]))
				duplicate.add(arr[i]);
			else
				unique.add(arr[i]);		
		}
		long end = System.currentTimeMillis();
		System.out.println("Smart Approach -> "+ (end-start) + " ms");
		return duplicate.toArray(new Integer[duplicate.size()]);
	}
	
}
