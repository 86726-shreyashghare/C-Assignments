package com.shreyash;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		char input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input - ");
		input = sc.next().charAt(0);
		
		if((input>='A')&&(input<='Z')) {
			System.out.println("It is UpperCase!");
		}
		else if((input>='a')&&(input<='z')) {
			System.out.println("It is LowerCase!");
		}
		else if((input>='0')&&(input<='9')) {
			System.out.println("It is Number");
		}
		else {
			System.out.println("Other Character!");
		}

	}

}
