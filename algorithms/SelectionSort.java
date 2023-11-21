package com.bridgelabs.algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
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

		selectionSort(arr);
		System.out.println("Sorted array is: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
