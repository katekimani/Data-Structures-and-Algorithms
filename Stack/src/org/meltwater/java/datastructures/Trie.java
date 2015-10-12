package org.meltwater.java.datastructures;


public class Trie implements Comparable<Trie>{
	static Node<?> rootNode;
	static Node<?> currentNode;
	static char firstLetter;
	
	public static Node Trie(){
		rootNode = new Node<Object>('\0', false);
		
		return rootNode;
	}
	
	public static void addWord(Node<?> rootNode, String word){
		int offset = 97;
		int wordLength = word.length();
		char[] letters = word.toCharArray();
		currentNode = rootNode;
		
		for(int i = 0; i < wordLength; i++){
			if(currentNode.treeLinks[letters[i]-offset] == null)
				currentNode.treeLinks[letters[i]-offset] = new Node<Object>(letters[i], i == wordLength-1 ? true : false);
			currentNode = currentNode.treeLinks[letters[i]-offset];
		}
	}
	
	public static boolean searchDictionary(String word){
			
			return true;
	}

	@Override
	public int compareTo(Trie arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
