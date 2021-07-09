package com.codewithtejas.interviewprep;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinneryTree {
	Node root = new Node(10);
	private Deque<Node> queue = new LinkedList<>();
	public BinneryTree() {
		this.root.left = this.createNode(2);
		this.root.right = this.createNode(4);
		this.root.left.left = this.createNode(5);
		this.root.left.right = this.createNode(6);
		this.root.right.right = this.createNode(7);
	}
	
	
	public void levelTrav(Node root) {
		if(root == null)
			return;
		
		Node temp = root;
		while(temp!=null) {
			System.out.println(temp.data);
			if(temp.left != null)this.queue.add(temp.left);
			if(temp.right != null)this.queue.add(temp.right);
			temp = !this.queue.isEmpty() ? this.queue.iterator().next() : null;
			if(temp!=null)
				this.queue.remove(temp);
			
		}
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	private Node createNode(int data) {
		return new Node(data);
	}
	
	
	
}

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
