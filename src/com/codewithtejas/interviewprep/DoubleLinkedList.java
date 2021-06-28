package com.codewithtejas.interviewprep;

public class DoubleLinkedList {
	
	private Node head = null;
	
	private class Node{
		private Node prev,next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		public String toString() {
			return this.data + " ";
		}
	}
	
	public void push(int data) {
			Node node = new Node(data);
			
			if(head == null) {
				head = node;
			}
			else {
				Node temp = this.head;
				Node prev = null;
				while(temp.next!=null) {
					prev = temp;
					temp = temp.next;
				}
				temp.next = node;
				temp.prev = prev;
			}
	}
	
	public void printDDL() {
		Node temp = head;
		while(temp!=null) {
			System.out.println("curr=>" + temp);
			System.out.println("prev=>" + temp.prev);
			temp = temp.next;
		}
		
	}
}
