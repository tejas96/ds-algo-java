package com.codewithtejas.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static List<Integer> getRow(int row){
		//base condition 
		if(row == 0)
				return new ArrayList<Integer>(Arrays.asList(1));
		if(row == 1)
				return new ArrayList<Integer>(Arrays.asList(1,1));
		else {
			List<Integer> out = getRow(row-1);
			List<Integer> newList = new ArrayList<>();
			newList.add(1);
			for(int i = 0; i<out.size()-1; i++) 
				newList.add(out.get(i) + out.get(i+1));
			newList.add(1);
			return newList;
		}
	}
	
	public static void printPascalTriangle(int row) {
		if(row == 0) {
			return;
		}
		else {
			List<Integer> prevRow = new ArrayList<>(Arrays.asList(1));
			System.out.println(prevRow);
			for(int i=1; i<=row; i++) {
				List<Integer> newRow = new ArrayList<>(Arrays.asList(1));
				for(int j=0; j<prevRow.size()-1; j++) {
					newRow.add(prevRow.get(j) + prevRow.get(j+1));
				}
				newRow.add(1);
				System.out.println(newRow);
				prevRow = newRow;
			}
		}
	}
	
	public static void printPascalXY(int row, int column) {
			if(row==0 && column==0) {
				System.out.println(1);
				return;
			}
			else {
				List<Integer> prevRow = new ArrayList<>(Arrays.asList(1,1));
				for(int i=2; i<=row; i++) {
					List<Integer> newRow = new ArrayList<>(Arrays.asList(1));
					for(int j=0; j<prevRow.size()-1; j++)
						newRow.add(prevRow.get(j) + prevRow.get(j+1));
					newRow.add(1);
					prevRow = newRow;
				}
				System.out.println(prevRow.get(column));
			}
	}
}
