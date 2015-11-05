package org.meltwater.java.datastructures;

public class Node<E> {
	
	int		key;
	E		element;
	public Node		next, position, leftChild, rightChild;

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
	
}