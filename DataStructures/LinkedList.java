package com.bridgelabs.DataStructures;

import java.util.Scanner;

//Create Linked Lists

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	// Insert at the beginning of the list
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Insert at the end of the list
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = newNode;
	}

	// Insert at the given position
	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			if (temp == null) {
				System.out.println("Invalid position");
				return;
			}
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete a node with a specific key
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;
	}

	// Delete a node at a specific position
	public void deleteNodeAtPosition(int position) {
		if (head == null)
			return;

		Node temp = head;
		if (position == 0) {
			head = temp.next;
			return;
		}

		while (temp != null && position > 1) {
			temp = temp.next;
			position--;
		}

		if (temp == null || temp.next == null)
			return;

		temp.next = temp.next.next;
	}

	// Delete first node
	public void deleteFirstNode() {
		if (head == null)
			return;
		head = head.next;
	}

	// Delete last node
	public void deleteLastNode() {
		if (head == null)
			return;

		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;
		temp.next = null;
	}

	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Scanner sc=new Scanner(System.in);
		
		int choice = 0;
		int data, position;

		while (choice != 9) {
			System.out.println("\n\n1. Insert at the beginning");
			System.out.println("2. Insert at the end");
			System.out.println("3. Insert at a specific position");
			System.out.println("4. Delete a node with a specific key");
			System.out.println("5. Delete a node at a specific position");
			System.out.println("6. Delete first node");
			System.out.println("7. Delete last node");
			System.out.println("8. Print the list");
			System.out.println("9. Exit");

			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				list.insertAtBeginning(data);
				break;
			case 2:
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				list.insertAtEnd(data);
				break;
			case 3:
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				System.out.print("Enter the position: ");
				position = sc.nextInt();
				list.insertAtPosition(data, position);
				break;
			case 4:
				System.out.print("Enter the key: ");
				data = sc.nextInt();
				list.deleteNode(data);
				break;
			case 5:
				System.out.print("Enter the position: ");
				position =sc.nextInt();
				list.deleteNodeAtPosition(position);
				break;
			case 6:
				list.deleteFirstNode();
				break;
			case 7:

				list.deleteLastNode();
				break;
			case 8:
				list.print();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Invalid choice");

			}

		}
	}
}