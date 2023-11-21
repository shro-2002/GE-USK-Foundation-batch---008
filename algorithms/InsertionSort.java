package com.bridgelabs.algorithms;

import java.util.Scanner;

public class InsertionSort {
	
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                // swap
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



}
