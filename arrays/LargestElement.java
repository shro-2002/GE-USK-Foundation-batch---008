package com.bridgelabs.arrays;

import java.util.Scanner;

public class LargestElement {

//  Program to print the largest element in an array

	// Method to find maximum in arr[]
	static int largest(int arr[], int n) {
		int i;

		// Initialize maximum element
		int max = arr[0];


		for (i = 1; i < n; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	static int[] printarray(int arr[], int n) {
		int i;


		for (i = 0; i < n; i++)
			System.out.println(arr[i]);

		return arr;
	}


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        printarray(arr,n);
        System.out.println("Largest element in the array: "+largest(arr,n));
	}
}

// Time Complexity: O(n)
// Space Complexity: O(1)
