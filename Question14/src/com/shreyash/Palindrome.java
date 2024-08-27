package com.shreyash;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check whether it is palindrome or not -  ");
		int num = sc.nextInt();
		int org = num,rev=0,rem;
		
		while (num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		
		if (org==rev) {
			System.out.println("Number is Palindrome!");
		} else {

			System.out.println("Number is not Palindrome!");
		}
		
	}

}
