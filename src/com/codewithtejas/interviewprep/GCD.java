package com.codewithtejas.interviewprep;

public class GCD {

	public static int findGCD(int no1, int no2) {
		if(no1 == 0 || no2 == 0)
			return Math.max(no1, no2);
		
		int minNo = Math.min(no1, no2);
		if(minNo%no1 == 0 && minNo%no2==0)
				return minNo;
		
		int maxGCD=0;
		for(int i = 2; i<=minNo/2; i++) {
			if(no1%i == 0 && no2%i == 0) {
				maxGCD = i;
			}
		}
		
		return maxGCD;
	}
}
