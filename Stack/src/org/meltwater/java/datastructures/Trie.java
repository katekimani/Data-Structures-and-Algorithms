package org.meltwater.java.datastructures;


public class Trie {

	char c;
	Trie[] nodes;
	boolean isWord;
		
	public Trie(){
		this.c = 0;
		this.nodes = new Trie[26];
		this.isWord = false;
	}
	
	public void addWord(String word){
		if(word.length() == 0){
			this.isWord = true;
			return;
		}
		
		char letter = word.charAt(0);
		int index = letter - 'a'; //numerical value of a is 97
		
		if(this.nodes[index] == null){
			this.nodes[index] = new Trie();	
		}
		
		this.nodes[index].addWord(word.substring(1));
			
	}

	
	public boolean searchDictionary(String word){
			
		if(word.isEmpty())
		{
			return this.isWord;
		}
		
		int index = word.toLowerCase().charAt(0) - 'a';
		if(this.nodes[index] == null)
		{
			return false;
		}
		
		return this.nodes[index].searchDictionary(word.substring(1));
		
	}

}
