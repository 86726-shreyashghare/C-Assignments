package com.shreyash;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int firstTerm = 0, secondTerm = 1, nextTerm, number;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth Term of Fibonacci Series - ");
		number = sc.nextInt();

		System.out.print("\nFibonacci Series - ");
		System.out.print(firstTerm + " " + secondTerm);

		for (int i = 0; i < number; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.print(" " + nextTerm);

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
