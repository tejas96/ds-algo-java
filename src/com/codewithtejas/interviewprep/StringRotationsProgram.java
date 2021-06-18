package com.codewithtejas.interviewprep;

public class StringRotationsProgram {

	
	public static boolean isPalindrome1(String str) {
		if(str.length() == 0)
				return false;
		int i=0, j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean isCyclic(String str1, String str2) {
		if(str1.length()==0 || str2.length() == 0 || str1.length() > str2.length() || str1.length() < str2.length())
			return false;
		int sum1=0, sum2=0;
		for(int i=0; i<str1.length(); i++) {
			sum1+=str1.codePointAt(i);
			sum2+=str2.codePointAt(i);
		}
		if(sum1==sum2)
				return true;
		return false;
	}
	
}
