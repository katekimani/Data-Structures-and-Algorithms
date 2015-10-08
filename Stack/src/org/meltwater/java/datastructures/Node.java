package org.meltwater.java.datastructures;

public class Node {
	int position;
	String element;
	
	public Node next;
	public Node previous;
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
}