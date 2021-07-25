package com.codewithtejas.interviewprep;

public class CountDigitsInNumber {

	/**
	 * time complexity O(digit in number)
	 * @param n
	 * @return
	 */
	public static int method1(int n) {
		
		if(n == 0)	
			return 1;
		int cnt = 0;
		while(n!=0) {
			n /=10;
			++cnt;
		}
		return cnt;
	}
	
	/**
	 * time complexity O(1)
	 * @param n
	 * @return
	 */
	public static int method2(int n) {
		return (int) (Math.floor(Math.log10(n)) + 1);
	}
}
