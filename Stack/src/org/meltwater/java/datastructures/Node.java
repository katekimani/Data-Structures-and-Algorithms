package org.meltwater.java.datastructures;

public class Node<E> {
	private static final int ALPHABET_LENGTH = 26;
	int  key;
	E element;
	boolean endPoint;
	char firstLetter;
	
	
	public Node next, position, leftChild, rightChild;
	public Node[] treeLinks;
	/**
	 * Constructor method for use with the LinkedList class.
	 * O(1)
	 * 
	 * @param position
	 * @param element
	 */
	public Node(Node position, E element){
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
	public Node(int key, E element){
		this.key = key;
		this.element = element;
	}
	
	public Node(E element) {
		this.element = element;
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