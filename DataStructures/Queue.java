package com.bridgelabs.DataStructures;

import java.util.Scanner;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        nItems--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        System.out.println("Queue is: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(queueArray[i]);
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    System.out.println("Dequeued value is: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Peeked value is: " + queue.peek());
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
    
}

