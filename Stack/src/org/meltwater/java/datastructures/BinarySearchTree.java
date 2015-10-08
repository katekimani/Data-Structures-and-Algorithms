package org.meltwater.java.datastructures;
/**
 * Source code reference http://www.newthinktank.com/2013/03/binary-tree-in-java/
 * @author katekimani
 *
 */
public class BinarySearchTree<E> {

	Node root;
	int size; 
	public BinarySearchTree(){
		size = 0;
	
		
	}
	/**
	 * Adds an element to the tree.
	 * O(logN)
	 * 
	 * @param element
	 */
	public boolean add(E element){
		
		Node newData = new Node(size, element);
		
		if(root == null){
			root = newData;
			
		}else{
			Node focus = root;
			Node parent;

			parent = focus;
			if(size < focus.key){
				focus = focus.leftChild;
				if(focus == null){
					parent.leftChild = newData;
					size++;
				}
			}else {
				focus = focus.rightChild;
				if(focus == null){
					parent.rightChild = newData;
				}
			}
		}
		return true;
	}
	/**
	 * Removes the specified element from the tree.
	 * O(1)
	 * 
	 * @param element
	 */
	public boolean remove(E element){
		return true;
	}
	/**
	 * Returns the number of nodes in the tree.
	 * O(1)
	 * 
	 */
	public int size(){
		return size;
	}
	/**
	 * Returns true if element is in tree.
	 * O(logN)
	 * 
	 * @param element
	 */
	public boolean contains(E element){
		return true;
	}
	/**
	 * Recursively searches for specified element in the tree.
	 * O(logN)
	 * 
	 * @param element
	 */
	public boolean rContains(E element){
		return true;
	}
	/**
	 * Returns the node that has the smallest value.
	 * 
	 */
//	public Node smallest(){
//		
//	}
	/**
	 * Returns the node that has the largest value.
	 * O(logN)
	 * 
	 */
//	public Node largest(){
//		
//	}
	/**
	 * Returns a String representation of the node values sorted in ascending order.
	 * O(n)
	 * 
	 */
//	public String toString(){
//		
//	}
}
