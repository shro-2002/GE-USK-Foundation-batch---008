package com.bridgelabs.Strings;

import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		int value = 0;

		for (int i = 0; i < str1.length(); i++) {
			value = value ^ (int) str1.charAt(i);
			value = value ^ (int) str2.charAt(i);
		}

		return value == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		
		boolean result = isAnagram(str1, str2);
		
		if (result)
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}

}
