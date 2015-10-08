package org.meltwater.java.datastructures;

public class BetterArray<E> {
	private static final int DEFAULT_SIZE = 10;
	private static final int NOT_FOUND = -1;
	private E[] array;
	private int size;
	
	/** 
	 * constructor for defining the initial state of the BetterArray 
	 */
	public BetterArray(){
		array = (E[]) new Object[DEFAULT_SIZE];
		size = 0;
	}
	/** 
	 * Adds new data to the array.
	 * O(1)
	 * 
	 * @param element - data to be added.
	 * @return boolean true if data is added.
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
			return true;
	}
	
	/** 
	 * Inserts data at a specified index
	 * O(n)
	 * 
	 * @param index - position to store the data
	 * @param element - data to be stored.
	 * @return int index of data. 
	 * @throws Exception
	 */
	public int insert(int index, E element) throws Exception{
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
		
		return index;
	}
	/** 
	 * Adds a new element at the start of the array
	 * O(n)
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void shift(E element) throws Exception{
		insert(0, element);
	}
	/** 
	 * Adds a new element at the end of the array
	 * O(1)
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void append(E element) throws Exception{
		insert(size,element);
	}
	/** 
	 * Checks whether a given value is in the array
	 * O(n)
	 * 
	 * @param element
	 * @return boolean true if found.
	 */
	public boolean contains(E element){
		int isFound = index(element);
		if(isFound == -1){
			return false;
		}
		return true;
	}
	/**
	 * Returns the index for a given element
	 * O(n)
	 * 
	 * @param element
	 * @return int index or -1 if not found
	 */
	public int index(E element){
		for(int i = 0; i < size; i++){
			if (element == array[i])
				return i;
		} 
		return NOT_FOUND;
	}
	/** 
	 * Returns the value stored at a specified index
	 * O(1)
	 * 
	 * @param index
	 * @return - data stored in the index position.
	 * @throws Exception
	 */
	public E get(int index) throws Exception{
		if(index < 0 || index >size) throw new Exception("Invalid index");
		System.out.println("Array - get The index is " +(Integer) array[index]);
		return array[index];
	}
	/** 
	 * Returns the number of elements stored in an array
	 * O(1)
	 * 
	 * @return int number.
	 */
	public int size(){
		return size;
	}
	/**
	 * Checks whether the array has data.
	 * O(1)
	 * 
	 * @return boolean true if the array has no data.
	 */
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	/** 
	 * Removes the element at index specified.
	 * O(n)
	 * 
	 * @param index
	 * @return boolean true if removed.
	 */
	public boolean remove(int index){
		return true;
	}
	
	/** 
	 * Removes all the occurrence of specified element in the array
	 * O(n)
	 * 
	 * @param element
	 * @return boolean true if removed.
	 */
	public boolean remove(E element){
		return true;
	}
	/** 
	 * Interchanges the order of elements in the array
	 * O(nlogn)
	 */
	public void reverse(){
		for(int i = 0; i < size/2; i++){
			E temp = array[size - i];
			array[size - i] = array[i];
			array[i] = temp;
		}
	}
	/** 
	 * Returns the array contents as a string
	 * O(n)
	 * 
	 * @return String with data content of array.
	 */
	public String toString(){
		if(isEmpty() == true){
			return ("{}");
		}
		String arrayString = "";
		for(int i = 0; i < size; i++){
			 arrayString += ("| " + array[i] + " ");
		}
		return arrayString;
	}

}