package com.codewithtejas.interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBookTrieAlgo {
	
	private Map<Character, Node> phoneBook;
	
	public PhoneBookTrieAlgo() {
		this.phoneBook = new HashMap<>();
		for(int i=97; i<=122; i++) {
			this.phoneBook.put((char)i, null);
		}
	}
	
	public void addContact(String name, String contactNo) {
			char startingLetter = name.charAt(0);
			Node head = this.phoneBook.get(startingLetter);
			Node contactNode = new Node(name, contactNo);
			if(head == null) {
				this.phoneBook.put(startingLetter, contactNode);
			}else {
				Node nextNode = head; 
				while(nextNode.next != null) {
					nextNode = nextNode.next;
				}
				nextNode.next = contactNode;
			}
	}
	
	public String[] getContact(String name) {
		name = name.toLowerCase();
		char startingLetter = name.charAt(0);
		Node head = this.phoneBook.get(startingLetter);
		List<String> fetchedContacts = new ArrayList<>();
		if(head == null)
			return null;
		else {
			Node node = head;
			while(node.next != null) {
				if(node.name.equalsIgnoreCase(name)) 
					fetchedContacts.add(String.format("Name : %s Contact : %s", node.name, node.contactNo));
				node = node.next;
			}
			
			if(node.name.equalsIgnoreCase(name))
				fetchedContacts.add(String.format("Name : %s  Contact : %s", node.name, node.contactNo));
		}
		
		return fetchedContacts.toArray(new String[fetchedContacts.size()]);
	}
	
	private class Node{
		Node next;
		String name;
		String contactNo;
		
		public Node(String name, String contactNo) {
			this.next = null;
			this.name = name;
			this.contactNo = contactNo;
		}
		
	}
}
