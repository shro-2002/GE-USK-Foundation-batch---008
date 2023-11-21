package com.bridgelabs.arrays;

import java.util.Scanner;

public class SecondLargest {

	// Function to print the second largest elements
	static void print2largest(int arr[], int n) {
		int i, first, second;

		if (n < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
		
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print2largest(arr, n);
    }

}
