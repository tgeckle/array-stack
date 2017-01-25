/**
 * Filename: ArrayStackTest.java
 * Author: Tea
 * Date: Aug 31, 2016
 * Purpose: To implement and test the ArrayStack class
 */
public class ArrayStackTest {
    
    public static void main(String[] args) {
        ArrayStack testStack = new ArrayStack(5);
        testStack.push("a");
        testStack.push("b");
        testStack.push("c");
        testStack.push("d");
        testStack.push("e");
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.push("f");
        testStack.push("g");
        testStack.push("h");
        testStack.push("i");
        testStack.push("j");
        
        System.out.println("Stack Size: " + testStack.getSize());
        System.out.println("Stack Capacity: " + testStack.getCapacity());
        testStack.printStack();
        
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        
        System.out.println("Stack Size: " + testStack.getSize());
        System.out.println("Stack Capacity: " + testStack.getCapacity());
        testStack.printStack();
        
    }

}
