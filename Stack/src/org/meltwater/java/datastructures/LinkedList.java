package org.meltwater.java.datastructures;
/*
 * TO DO - Fix the contains method to stop returning the first value only.
 * TO DO - Fix the remove to handle the last node in the list.
 */
public class LinkedList<E> {
	
	public Node<E> currentNode;
	int count;
	
	/**
	 * Constructor method
	 */
	public LinkedList(){
		currentNode = new Node(null,"dud");
		count = 0;
		
	}
	/**
	 * Adds data to the list.
	 * O(1)
	 * 
	 * @param position -node position to add data to.
	 * @param element - data to be added.
	 */
	public void add(Node<E> position, E element){
		Node<E> newNode = new Node<E>(position, (String) element);
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		count++;
	}
	
	public void add(E element){
		
		add(currentNode,element);
	}
	
	/**
	 * Adds elem2 in the list in the position before elem1.
	 * O(n)
	 * 
	 * @param elem1
	 * @param elem2
	 */
	public void insertBefore(E elem1, E elem2){
		Node<E> currNode = contains(elem1);
		if(currNode != null){
			add(currNode,elem2);
		}
		
	}
	
	/**
	 * Adds elem2 in the list in the position after elem1.
	 * O(n)
	 * 
	 * @param elem1
	 * @param elem2
	 */
	public void insertAfter(E elem1, E elem2){
		Node<E> currNode = contains(elem1);
		if(currNode != null){
			currNode = currNode.next;
			add(currNode,elem2);
		}
	}
	/**
	 * Returns number of elements stored in list.
	 * O(1)
	 * 
	 * @return
	 */
	public int size(){
		return count;
	}
	/**
	 * Checks whether an element is in the list.
	 * O(n)
	 * 
	 * @param element 
	 * @return Node position data of element
	 */
	public Node contains(E element){
		if(isEmpty())
			return null;
		
		Node currNode = currentNode;
		System.out.println("The current node element is : "+toString(currNode));
		while(!currNode.element.equals(element) && currNode.next != null){
			currNode = currNode.next;
			System.out.println("The current node element is : "+toString(currNode));
			}
			return currNode;
		
	}
	/**
	 * Returns the first element in the list.
	 * O(n)
	 * 
	 * @return String element
	 */
	public String head(){
		
		if(isEmpty())
			return null;
		
		Node headNode = null, currNode = currentNode;
		
		while(currNode != null){
			headNode = currNode;
			currNode = currNode.next;
		}
	
		return headNode.element;
	}
	/**
	 * Returns the last element added to the list.
	 * O(1)
	 * 
	 * @return String element.
	 */
	public String tail(){
		return currentNode.element;
	}
	/**
	 * Removes the provided element from the list.
	 * O(1)
	 * 
	 * @param element the data value to remove.
	 * @return boolean true if remove happens.
	 */
	public boolean remove(E element){
		if(isEmpty())
			return false;
		
		Node<E> currNode = contains(element);
		if(currNode !=null)
			System.out.println("The node in remove process is : " +toString(currNode));
		if(currNode.next != null){
			currNode.next = currNode.next.next;
		} 
		return true;
		
	}
	/**
	 * Checks the list size for elements.
	 * O(1)
	 * 
	 * @return boolean true if list is empty.
	 */
	public boolean isEmpty(){
		return size() == 0;

	}
	/**
	 * Changes the order of the nodes in the list
	 * O(logN)
	 */
	public void reverse(){
		
	}
	/**
	 * Returns the elements of the list as a set of strings.
	 * O(n)
	 */
	public String toString(){
		Node currNode = currentNode;
		String elements = "";
		
		while(currNode != null){
			elements += "| " +currNode.element;
			currNode = currNode.next;
		}
		return elements;
	}
	
	public String toString(Node position){
		
		return "| " +position.element +" | ";
			
	}
}
