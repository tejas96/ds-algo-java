package com.codewithtejas.interviewprep;

import java.util.Arrays;
import java.util.Stack;
//[2,1,5,6,2,3]
public class MaxAreaInHisotgram {

	public static int findMaxArea(int arr[]) {
		
		Stack<Integer> left = new Stack<>();
		left.add(0);
		Stack<Integer> right = new Stack<>();
		right.add(arr.length-1);
		int leftArea[] = new int[arr.length];
		int rightArea[] = new int[arr.length];
		leftArea[0] = 0;
		rightArea[arr.length-1] = 0;
		
		for(int i =1; i<arr.length; i++) {
			if(!left.isEmpty() && arr[left.peek()] >= arr[i]) {
				while(!left.isEmpty()) {
					if(arr[left.peek()] >= arr[i]) {
						leftArea[i] = left.pop();
					}
					else {
						break;
					}
				}
				left.add(i);
			}else {
				left.add(i);
				leftArea[i] = i;
			}
		}
		//[2,1,5,6,2,3]
		for(int i = arr.length-2; i>=0; i--) {
			if(!right.isEmpty() && arr[right.peek()] >= arr[i]) {
				while(!right.isEmpty()) {
					if(arr[right.peek()] >= arr[i]) {
						rightArea[i] = right.pop();
					}
					else {
						break;
					}
				}
				right.add(i);
			}else {
				right.add(i);
				rightArea[i] = i;
			}
		}
		
		int maxArea = 0;
		for(int i =0; i < arr.length; i++) {
			int area = ((rightArea[i]-leftArea[i]) + 1) * arr[i];
			if(area > maxArea)
					maxArea = area;
			
		}
		return maxArea;
	}
}
