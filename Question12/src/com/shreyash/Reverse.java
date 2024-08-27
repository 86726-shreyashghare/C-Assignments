package com.shreyash;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String - ");
		String str = sc.nextLine();
		char ch;
		String str2 ="";
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			str2=ch+str2;
		}
		
		System.out.println("\nReverse String = "+str2);
		

	}

}
