package org.meltwater.java.datastructures;

import java.util.Arrays;

public class BetterArray<E> {
	private static final int DEFAULT_SIZE = 10;
	private static final int NOT_FOUND = -1;
	private E[] array;
	private int size;
	
	/** constructor for defining the initial state of the BetterArray
	 * 
	 */
	public BetterArray(){
		array = (E[]) new Object[DEFAULT_SIZE];
		size = 0;
	}
	/** handles the major insert to the array
	 * 
	 * @param element
	 * @return
	 */
	public boolean add(E element){
		
		if(size == array.length){
			E[] newArray = (E[]) new Object[array.length*2];
			for(int i = 0; i < array.length; i++){
				newArray[i] = array[i];
			}
			array = newArray;
		}
			array[size++] = (E) element;
			System.out.println("Array - add The data is " +Arrays.toString(array));
			return true;
	}
	
	/** allows an insert to be done at a specified index
	 * 
	 * @param index
	 * @param element
	 * @return
	 * @throws Exception
	 */
	public E[] insert(int index, E element) throws Exception{
		if(index > size) throw new Exception("Index invalid");
		if(index == size){
			add(element);
		}
		if(index < size){
			for(int i = size; i > index; i--){
				array[size] = array[size - 1]; 
			}
			array[index] = element;
			size++;
		}
		System.out.println("Array - insert The data is " +Arrays.toString(array));
		return array;
	}
	/** method for adding a new element at the start of the array
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void shift(E element) throws Exception{
		insert(0, element);
	}
	/** method for adding a new element at the end of the array
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void append(E element) throws Exception{
		insert(size,element);
	}
	/** method for checking whether a given value is in the array
	 * 
	 * @param element
	 * @return
	 */
	public boolean contains(E element){
		int isFound = index(element);
		if(isFound == -1){
			return false;
		}
		return true;
	}
	/** method for getting the index for a given element
	 * 
	 * @param element
	 * @return
	 */
	public int index(E element){
		for(int i = 0; i < size; i++){
			if (element == array[i])
				return i;
		} 
		return NOT_FOUND;
	}
	/** method for returning the value stored at the provided index
	 * 
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public int get(int index) throws Exception{
		if(index < 0 || index >size) throw new Exception("Invalid index");
		System.out.println("Array - get The index is " +(Integer) array[index]);
		return (Integer) array[index];
	}
	/** method for checking the number of elements stored in an array
	 * 
	 * @return
	 */
	public int size(){
		return size;
	}
	/** method for checking whether the array is empty
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		} 
		return false;
	}
	
	/** remove the element at index passed from the array
	 * 
	 * @param index
	 * @return
	 */
	public boolean remove(int index){
		return true;
	}
	
	/** remove all the occurrence of the element in the array
	 * 
	 * @param element
	 * @return
	 */
	public boolean remove(E element){
		return true;
	}
	/** method for interchanging the order of elements in the array
	 *  
	 */
	public void reverse(){
		for(int i = 0; i < size/2; i++){
			E temp = array[size - i];
			array[size - i] = array[i];
			array[i] = temp;
		}
		System.out.println("Array reverse - The reverse is " +Arrays.toString(array));
	}
	/** method for changing the array contents to a string output
	 * 
	 */
	public String toString(){
		if(isEmpty() == true){
			return ("{}");
		}
		String arrayString = "";
		for(int i = 0; i < size; i++){
			 arrayString += ("| " + array[i] + " ");
		}
		System.out.println("Array toString - The return is " +arrayString);
		return arrayString;
	}


}
	
