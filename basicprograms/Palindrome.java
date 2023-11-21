package com.bridgelabs.basicprograms;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		return rev == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));

	}
}
