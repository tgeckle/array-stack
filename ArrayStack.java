/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tea
 */
public class ArrayStack {

    private int size = 0;
    private int capacity = 0;
    private String[] backingArray;
    
    // No-argument constructor
    public ArrayStack() {
        capacity = 1;
        backingArray = new String[capacity];
    }
    
    // Takes starting size as argument
    public ArrayStack(int length) {
        capacity = length;
        backingArray = new String[capacity];
    }
    
    // Adds one element to the top of the stack
    public void push(String input) {
        if (capacity < size + 1) {
            resize();
        }
        backingArray[size] = input;
        size++;
    }
    
    // Returns the topmost element from the stack. 
    public String pop() {
        String result = "";
        if (size > 0) {
            size--;
            if ((size > 0) && ((capacity / size) > 3)) {
                resize();
            }
            result = backingArray[size];
            backingArray[size] = "";
        }
        else {
            throw new IndexOutOfBoundsException();
        }
        
        return result;
    }
    
    public void resize() {
        capacity = size * 2;
        String[] tempArray = backingArray;
        backingArray = new String[capacity];
        System.arraycopy(tempArray, 0, backingArray, 0, size);
    }
    
    public int getSize() {
        return size;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void printStack() {
        for (int i =0; i < size; i++) {
            System.out.print(backingArray[i]);
        }
        System.out.println();
    }
    
}
