package com.codewithtejas.interviewprep;

public class PalindromNumber {
	
	public static boolean isNumberPalindrome(int n) {
		
		int res = 0;
		int real = n;
		
		while(n!=0) {
			res = (res*10) + (n%10);
			n/=10;
		}
		if(real == res)
			return true;
		return false;
	}
}
