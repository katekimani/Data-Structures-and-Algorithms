package org.meltwater.java.datastructures;

public class Node<E> {
	private static final int ALPHABET_LENGTH = 26;
	int position, key;
	E value;
	String element;
	boolean endPoint;
	char firstLetter;
	
	
	public Node next, leftChild;
	public Node previous, rightChild;
	public Node[] treeLinks;
	/**
	 * Constructor method for use with the LinkedList class.
	 * O(1)
	 * 
	 * @param position
	 * @param element
	 */
	public Node(int position, String element){
		this.position = position;
		this.element = element;
	}
	/**
	 * Constructor method for use with the BinarySearchTree class.
	 * O(1)
	 * 
	 * @param key
	 * @param value
	 */
	public Node(int key, E value){
		this.key = key;
		this.value = value;
	}
	/**
	 * Constructor method for use with the SpellChecker class.
	 * O(1)
	 * 
	 * @param letter
	 * @param endPoint
	 */
	public Node(char letter, boolean endPoint){
		this.firstLetter = letter;
		this.endPoint = endPoint;
		treeLinks = new Node[ALPHABET_LENGTH];
	}
}