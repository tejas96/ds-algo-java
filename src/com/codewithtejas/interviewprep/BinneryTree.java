package com.codewithtejas.interviewprep;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.codewithtejas.model.Node;

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
	
	//BST - method 1 
	public static boolean isBst(Node root) {
		if(root == null)
			return true;
		if(root.left != null && !(root.left.data <= root.data))
			return false;
		if(root.right!= null && !(root.right.data >= root.data))
			return false;
		
		if(!isBst(root.left) || !isBst(root.right))
			return false;
		return true;
	}

	//BST - method - 2
	public static boolean isBst2(Node root, int min, int max) {
		if(root == null)
			return true;
		if(!(root.data >= min && root.data <= max))
			return false;
		if(!isBst2(root.left, 0, root.data) || !isBst2(root.right, root.data, max))
			return false;
		return true;
	}
	
	private Node createNode(int data) {
		return new Node(data);
	}
	
	//find kth smallest element in BST
	public static int findkSmallestElementInBst(Node root, int k) {
		List<Node> nodeList = getBineryTreeInList(root, new ArrayList<>());
		return nodeList.get(k-1).data;
	}
	
	private static List<Node> getBineryTreeInList(Node root,List<Node> list){
		if(root==null)
			return null;
		getBineryTreeInList(root.left,list);
		list.add(root);
		getBineryTreeInList(root.right, list);
		return list;
	}
	
}

