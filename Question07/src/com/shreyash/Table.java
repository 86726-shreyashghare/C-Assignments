package com.shreyash;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number To Print its Table - ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
