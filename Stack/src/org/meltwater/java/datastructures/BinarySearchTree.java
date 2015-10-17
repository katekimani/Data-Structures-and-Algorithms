package org.meltwater.java.datastructures;
/**
 * @author katekimani
 *
 */
public class BinarySearchTree<E extends Comparable> {

	Node root;
	int size; 
	public BinarySearchTree(){
		size = 0;
		root = null;
	
		
	}
	/**
	 * Adds an element to the tree.
	 * O(logN)
	 * 
	 * @param element
	 * @throws Exception 
	 */
	public void add(E element) throws Exception{
		root = insert(root, element);
		
	}
	
	protected Node insert(Node r, E elem) throws Exception{
		if (root == null){
			root = new Node<E>(elem);
		}else if(elem.compareTo(root.element) < 0){
			root.leftChild = insert(root.leftChild, elem);
		}else if(elem.compareTo(root.element) > 0){
			root.rightChild = insert(root.rightChild, elem);
		}else{
			throw new Exception(elem.toString());
		}
		size++;	 
		return root;	
	}
	/**
	 * Removes the specified element from the tree.
	 * O(1)
	 * 
	 * @param element
	 */
	public String remove(E element) throws Exception{
		return remove(root, element).toString();
	}
	
	protected Node remove(Node root, E elem) throws Exception{
		if(root == null)
			throw new Exception(elem.toString());
		
		if(elem.compareTo(root.element) < 0){
			root.leftChild = remove(root.leftChild, elem);	
		}else if(elem.compareTo(root.element) > 0){
			root.rightChild = remove(root.rightChild, elem);
		}else if(root.leftChild != null && root.rightChild != null){
			//TO DO remove and replace code
		}else{
			root = (root.leftChild != null) ? root.leftChild : root.rightChild;
		}
		size--;
		return root;
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
	 * Returns the element if found else null.
	 * O(logN)
	 * 
	 * @param element
	 */
	public String contains(E element){
		return find(root, element).toString();
	}
	
	
	protected Node find(Node root, E elem){
		while(root != null){
			if(elem.compareTo(root.element) < 0){
				root = root.leftChild;
			}else if(elem.compareTo(root.element) > 0){
				root = root.rightChild;
			}else {
				return root; //match found
			}
		}
		return null; //Not found
	}
	/**
	 * Recursively searches for specified element in the tree.
	 * O(logN)
	 * 
	 * @param element
	 */
//	public void rContains(E element);

	/**
	 * Returns the node that has the smallest value.
	 * 
	 */
	public Node smallest(Node root){
		if(root != null){
			while(root.leftChild != null){
				root = root.leftChild;
			}
		}
		return root;
	}
	/**
	 * Returns the node that has the largest value.
	 * O(logN)
	 * 
	 */
	public Node largest(Node root){
		if(root != null){
			while(root.rightChild != null){
				root = root.rightChild;
			}
		}
		return root;
	}
	/**
	 * Returns a String representation of the node values sorted in ascending order.
	 * O(n)
	 * 
	 */
//	public String toString(){
//		
//	}
}
