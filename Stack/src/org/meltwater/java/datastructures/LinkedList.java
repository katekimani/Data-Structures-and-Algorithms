package org.meltwater.java.datastructures;

public class LinkedList<E> {
	
	public Node lastNode;
	Node prevNode;
	int count;
	
	/**
	 * Constructor method
	 */
	public LinkedList(){
		lastNode = null;
		count = 0;
		
	}
	/**
	 * Adds data to the list.
	 * O(1)
	 * 
	 * @param position -node position to add data to.
	 * @param element - data to be added.
	 */
	public void add(int position, E element){
		Node newNode = new Node(position, (String) element);
		
		newNode.next = lastNode;
		lastNode = newNode;
		count++;
	}
	/**
	 * Adds elem2 in the list in the position before elem1.
	 * O(n)
	 * 
	 * @param elem1
	 * @param elem2
	 */
	public void insertBefore(E elem1, E elem2){
		Node currNode = contains(elem1);
		if(currNode != null){
//			int curNod = (int) currNode;
//			add(curNod,elem2);
			
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
		Node currNode = lastNode;
		
		if(size() != 0){
			while(currNode.element != element){
				prevNode = currNode;
				currNode = currNode.next;
				if(currNode == null){
					return null;
				}
				
			}return currNode;
			
		}return null;
	}
	/**
	 * Returns the first element in the list.
	 * O(n)
	 * 
	 * @return String element
	 */
	public String head(){
		Node headNode = null, currNode = lastNode;
		
		if(size() != 0){
			while(currNode != null){
				headNode = currNode;
				currNode = currNode.next;
			}
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
		return lastNode.element;
	}
	/**
	 * Removes the provided element from the list.
	 * O(1)
	 * 
	 * @param element the data value to remove.
	 * @return boolean true if remove happens.
	 */
	public boolean remove(E element){
		
		Node currNode = contains(element);
		if(currNode != null){
			if(currNode == lastNode){
				lastNode = lastNode.next;
			}
			prevNode = currNode.next;
			return true;
		}
		return false;
		
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
	 * O(nlogn)
	 */
	public void reverse(){
		
	}
	/**
	 * Returns the elements of the list as a set of strings.
	 * O(n)
	 */
	public String toString(){
		Node currNode = lastNode;
		String elements = "";
		while(currNode != null){
			elements += "| " +currNode.element;
			currNode = currNode.next;
		}
		return elements;
	}
}
