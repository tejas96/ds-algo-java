package com.codewithtejas.app;

import java.util.Arrays;

import com.codewithtejas.interviewprep.ArrayFindDuplicates;
import com.codewithtejas.interviewprep.DoubleLinkedList;
import com.codewithtejas.interviewprep.GCD;
import com.codewithtejas.interviewprep.KFrequent;
import com.codewithtejas.interviewprep.LRU;
import com.codewithtejas.interviewprep.MaxAreaInHisotgram;
import com.codewithtejas.interviewprep.NextGreterElementDistance;
import com.codewithtejas.interviewprep.StringRotationsProgram;
import com.codewithtejas.interviewprep.TrieAlgoImpl;
import com.codewithtejas.interviewprep.PascalTriangle;
import com.codewithtejas.interviewprep.PhoneBookTrieAlgo;
import com.codewithtejas.interviewprep.ReverseArray;


public class DSAndAlgo {

	public static void main(String[] args) {
			
		//System.out.println(Arrays.toString(NextGreterElementDistance.stackApproach(new int[] {53, 59, 58, 61, 73, 64, 72})));
		//System.out.println(PascalTriangle.getRow(4));
		//PascalTriangle.printPascalTriangle(4);
		//PascalTriangle.printPascalXY(4, 3);
		//System.out.println(Arrays.toString(ArrayFindDuplicates.findDuplicatesSmartApproach(new int[]{1,5,6,8,4,34,34,34,4,78,3,12,4,8,9,23,45,3,2,6,9})));
		//System.out.println(Arrays.toString(ArrayFindDuplicates.findDuplicatesNaiveApproach(new int[]{1,5,6,8,4,34,34,34,4,78,3,12,4,8,9,23,45,3,2,6,9})));
		//System.out.println(MaxAreaInHisotgram.findMaxArea(new int[] {2,1,5,6,2,3}));
		
//		PhoneBookTrieAlgo phoneBook = new PhoneBookTrieAlgo();
//		phoneBook.addContact("tejas", "8087823247");
//		phoneBook.addContact("tejas", "8087823248");
//		phoneBook.addContact("tejas", "8087823249");
//		phoneBook.addContact("yogita", "8600080768");
//		
//		System.out.println(Arrays.toString(phoneBook.getContact("yo")));
//		System.out.println(StringRotationsProgram.isPalindrome1("MOK"));
//		System.out.println(StringRotationsProgram.isCyclic("ABCDD", "CDAB"));
//		System.out.println(Arrays.toString(ReverseArray.reverse(new int[] {1,2,3,4,5})));
//		System.out.println(GCD.findGCD(100, 100));
//		TrieAlgoImpl trie = new TrieAlgoImpl();
//		trie.insert("aba");
//		trie.insert("abc");
//		trie.show();
//		
//		DoubleLinkedList ddl = new DoubleLinkedList();
//		ddl.push(1);
//		ddl.push(2);
//		ddl.push(3);
//		ddl.push(4);
//		ddl.printDDL();
		
//		KFrequent.findKfrequent(new int[] {1, 2,3,1,2,4,4,4,6,8,9,3,2}, 2);
		
		LRU cache = new LRU(3);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(4);
		cache.refer(2);
		cache.display();
	}

}
