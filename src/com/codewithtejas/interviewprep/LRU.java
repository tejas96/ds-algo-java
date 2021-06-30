package com.codewithtejas.interviewprep;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LRU {
	
	private final int CAPACITY;
	Set<Integer> catche;
	public LRU(int size) {
		this.CAPACITY = size;
		this.catche = new LinkedHashSet<>(this.CAPACITY);
	}
	
	private boolean get(int data) {
		if(this.catche.contains(data)) {
			this.catche.remove(data);
			this.catche.add(data);
			return false;
		}
		return true;
	}
	
	private void put(int data) {
		if(this.catche.size() == this.CAPACITY) {
			int first = this.catche.iterator().next();
			this.catche.remove(first);
		}
		this.catche.add(data);
	}
	public void refer(int data) {
		if(this.get(data))
			this.put(data);
	}
	public void display() {
		Iterator<Integer> it = this.catche.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
