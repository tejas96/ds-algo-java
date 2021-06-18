package com.codewithtejas.interviewprep;

public class ReverseArray {

	public static int[] reverse(int []arr) {
		int j=arr.length-1;
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		return arr;
	}
}
