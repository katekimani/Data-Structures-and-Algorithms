package org.meltwater.java.datastructures;

public class Stack<E> {
	private static final int DEFAULT_LENGTH = 10;
	private E[] stackArray;
	int size;
	
	/**
	 * Constructor class
	 */
	public Stack(){
		stackArray = (E[]) new Object[DEFAULT_LENGTH];
		size = 0;
	}
	
	/**
	 * Adds data to the stack.
	 * O(1)
	 * 
	 * @param element
	 */
	public void push(E element){
		if(size == stackArray.length){
			E[] tempArray = (E[]) new Object[stackArray.length*2];
			for(int i = 0; i < stackArray.length; i++){
				tempArray[i] = stackArray[i];
			} stackArray = tempArray; 
		}
		
		stackArray[size++] = element;
		
    }
	
	/**
	 * Removes the data that was added last from the stack.
	 * O(1)
	 * 
	 * @return
	 */
	public int pop(){
		
		if(stackArray.length == 0){
			System.out.println("Empty stack");
			System.exit(1);
		}
		int value = (Integer) stackArray[size-1];
		E[] tempArray = (E[]) new Object[stackArray.length];
		
		for(int i = 0; i < size-1; i++){
			tempArray[i] = stackArray[i];
		} 
		stackArray = tempArray; 
		size--;
		
		return value; 
		
	}
	
	/**
	 * Returns the count of data units stored in the stack.
	 * O(1)
	 * 
	 * @return
	 */
	public int size(){
		return size;
	}
	
	/**
	 * Checks whether a specified data element is in the stack.
	 * O(n)
	 * 
	 * @param element
	 * @return boolean true if found.
	 */
	public boolean contains(E element){
		for(int i = 0; i < size; i++){
			if (element == stackArray[i])
				return true;
		} 
		return false;
	}
}