package com.bridgelabs.arrays;

import java.util.Scanner;

public class EqualSum {
	

    public static boolean checkSum(int[] arr, int n) {
        int sum1 = 0, sum2 = 0;
        

        for (int i = 0; i < n / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = n / 2; i < n; i++) {
            sum2 += arr[i];
        }
        if (sum1 == sum2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt(); // size of array
        
        int[] arr = new int[n]; // array
        
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input array
        }
        if (checkSum(arr, n)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

}
