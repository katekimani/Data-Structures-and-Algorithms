package org.meltwater.java.datastructures;

public class Node<E> {
	int position, key;
	E value;
	String element; 
	
	public Node next, leftChild;
	public Node previous, rightChild;
	/**
	 * Constructor method.
	 * O(1)
	 * 
	 * @param position
	 * @param element
	 */
	public Node(int position, String element){
		this.position = position;
		this.element = element;
	}
	
	public Node(int key, E value){
		this.key = key;
		this.value = value;
	}
}