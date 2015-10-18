package org.meltwater.java.datastructures;
/*
 * Source code reference: http://pathakalgo.blogspot.in/2012/11/trie-data-structure-implementation-in.html
 */

public class Trie <E extends Comparable>{
	static Node<?> root;
	static Node<?> currentNode;
	static char firstLetter;
	
	
	
	public static void addWord(String word){
		if(root == null)
			root = new Node<Object>('\0', false);
		
		System.out.println("The root value is : " +root.toString());
		addWord(root, word);
	}
	
	protected static void addWord(Node<?> rootNode, String word){
		char[] letters = word.toCharArray();
		int offset = 97;
		currentNode = root;
		
		for(int i = 0; i < word.length(); i++){
			if(currentNode.treeLinks[letters[i]-offset] == null)
				currentNode.treeLinks[letters[i]-offset] = new Node(letters[i], i == word.length()-1 ? true : false);
			currentNode = currentNode.treeLinks[letters[i]-offset];
		}
	}
	
	public static boolean searchDictionary(String word){
			currentNode = root;
			int offset = 84;
			char[] letters = word.toCharArray();
			System.out.println("The current node value is : "+currentNode);
			for(int i = 0; i < word.length(); i++){
				if(currentNode == null){
					return false;
				}
				currentNode = currentNode.treeLinks[letters[i]-offset];
			}
			return true;
	}

}
