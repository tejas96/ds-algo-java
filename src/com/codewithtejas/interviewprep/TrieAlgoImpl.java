package com.codewithtejas.interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrieAlgoImpl {

	private Node root=new Node('\0', false, new ArrayList<>(Collections.nCopies(26, null)));
	
	public void insert(String data) {
		this.insertHelper(root, data.toLowerCase(), 0);
	}
	
	public void show() {
		System.out.println(this.root);
	}
	
	private void insertHelper(Node root, String data, int index) {
		
		if(root == null || index >= data.length())
			return;
		
		Character character = data.charAt(index);
		int childIndex = character - 'a';
		Node node = root.childNodes.get(childIndex);
		
		if(node != null)
			insertHelper(node, data, ++index);
		
		if(!(index >= data.length()))
		{
			root.childNodes.set(childIndex, new Node(character, index==data.length()-1 ? true : false, root.childNodes));
			insertHelper(root.childNodes.get(childIndex), data, ++index);
		}
	}
	
	private class Node{
		Character character;
		Boolean isWordEnd;
		List<Node> childNodes;
		public Node() {}
		public Node(Character character, Boolean isWordEnd, List<Node> childrens) {
			this.character = character;
			this.isWordEnd = isWordEnd;
			this.childNodes = childrens;
		}
	}
}
