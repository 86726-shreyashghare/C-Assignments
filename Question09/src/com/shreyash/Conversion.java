package com.shreyash;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Any Numner - ");
		int num = sc.nextInt();

		System.out.println("\nDecimal = " + num);
		System.out.println("Binary = " + Integer.toBinaryString(num));
		System.out.println("Octal = " + Integer.toOctalString(num));
		System.out.println("HexaDecimal = " + Integer.toHexString(num));

	}

}
