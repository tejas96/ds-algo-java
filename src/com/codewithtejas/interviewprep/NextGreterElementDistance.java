package com.codewithtejas.interviewprep;

import java.util.Stack;

/*
Find the distance to the next highest element for each element in the input array
Input - [53, 59, 58, 61, 73, 64, 72]
Output - [1, 2, 1, 1, -1, 1, -1]
*/

public class NextGreterElementDistance {
	
	public static int[] naiveApproach(int arr[]) {
		int output[] = new int[arr.length];
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			flag=false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					flag = true;
					output[i] = j-i; 
					break;
				}
			}
			if(!flag)
				output[i] = -1;
				
		}
		return output;
	}
	
	//[53, 59, 58, 61, 73, 64, 72]
	public static int[] stackApproach(int arr[]) {
		int output[] = new int[arr.length];
		
		Stack<Integer> stack = new Stack<>();
		stack.add(0);
		
		for(int i = 1; i<arr.length; i++) {
			if(!stack.isEmpty() && arr[i] > stack.peek()) {
				while(!stack.isEmpty()) {
					if(arr[i] > arr[stack.peek()])
						output[stack.peek()] = i - stack.pop();
					else {
						break;
					}
				}
				stack.add(i);
			} else {
				stack.add(i);
			}
		}
		while(!stack.isEmpty()) 
			output[stack.pop()] = -1;
		return output;
	}
}
