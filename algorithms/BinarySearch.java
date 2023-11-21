package com.bridgelabs.algorithms;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (low <= high) {
			 mid = (low + high) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else if (key > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the key to search: ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		if (index == -1) {
			System.out.println("Key not found");
		} else {
			System.out.println("Key found at index " + (index + 1));
		}
	}
}
