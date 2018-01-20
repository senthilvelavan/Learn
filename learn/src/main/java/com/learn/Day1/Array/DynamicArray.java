package com.learn.Day1.Array;

import java.util.Arrays;

/**
 * http://www.algolist.net/Data_structures/Array
 * 
 * 
 * @author sesankaran
 *
 */

public class DynamicArray{

    int[] storage = new int[15];
    int size;


    public DynamicArray(){
        storage = new int[15];
        size = 0; 
    }
    
    public DynamicArray(int size){
    		storage = new int[size];
    		size = 0;
    }
    
    //method to invoke when dynamic array is full on capacity
    public void ensureCapacity(int minCapacity){
        int capacity = storage.length;
        if(minCapacity > capacity){
            int newCapacity = (capacity*3)/2+1;
            storage = Arrays.copyOf(storage, newCapacity);
        }
    }
    
    //method to invoke when dynamic array is more on capacity
    public void pack(){
        if(size/storage.length < 0.5){
            int newCapacity = (size*3)/2+1;
            storage = Arrays.copyOf(storage, newCapacity);
        }
    }
    
    //to retrofit the size of an array
    public void trim(){
        storage = Arrays.copyOf(storage, storage.length);
    }
    
    public void rangeCheck(int position){
        if(position < 0 && position > storage.length){
            System.out.println("outside the range");
        }
    }
    
    public int get(int position){
        rangeCheck(position);
        return storage[position];
    }
    
    public void set(int position, int value){
        rangeCheck(position);
        storage[position] = value;
        size++;
    }
    
    public void insertAt(int position, int value){
        ensureCapacity(storage.length+1);
        int moveCount = size - position;
        System.arraycopy(storage, position, storage, position+1, moveCount);
        set(position, value);
    }
    
    public void removeAt(int position){
        int moveCount = size-1-position;
        System.arraycopy(storage, position+1, storage, position, moveCount);
        size--;
        trim();
    }
    
    public void print() {
    	for(int counter=0;counter<this.size;counter++) {
    		System.out.println(this.get(counter));
    		}
    }
    
    public static void main(String args[]) throws Exception{
    		DynamicArray dynamicArray = new DynamicArray(15);
    		
    		dynamicArray.set(0, 1);
    		dynamicArray.set(1, 11);
    		dynamicArray.set(2, 21);
    		
    		System.out.println(dynamicArray.size);
    		System.out.println(dynamicArray.storage.length);
    		
    		System.out.println(dynamicArray.get(1));
    		dynamicArray.print();
    		System.out.println("initial array");
    		
    		dynamicArray.insertAt(1, 10);
    		
    		
    		dynamicArray.print();
    		System.out.println("after inserting");
    		
    		dynamicArray.removeAt(1);
    		
    		dynamicArray.print();
    		System.out.println("after removing");
    		
    }

}