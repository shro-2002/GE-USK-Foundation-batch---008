package com.bridgelabs.DataStructures;

import java.util.Scanner;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize - 1 == top;
    }

    public int size() {
        return top + 1;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        System.out.println("Stack is: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }


    
    }



    public static void main(String[] args) {
        Stack stack = new Stack(10);

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Popped value: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Peek value: " + stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
