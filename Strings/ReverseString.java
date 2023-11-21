package com.bridgelabs.Strings;

import java.util.Scanner;

public class ReverseString {
    // Method to reverse the string
    static void reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));

            reverse(str.substring(0, str.length() - 1));
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string to be reversed: ");
        String str = sc.nextLine();
        
        System.out.println("The reversed string is: ");
        reverse(str);
    }
}
