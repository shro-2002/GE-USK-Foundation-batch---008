package com.bridgelabs.basicprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check prime");
		int num = sc.nextInt();

		System.out.println(isPrime(num));
	}
}
