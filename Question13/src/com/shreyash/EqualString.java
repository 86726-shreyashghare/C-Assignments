package com.shreyash;

import java.util.Scanner;

public class EqualString {

	public static void main(String[] args) {

		String[] arr = { "Shreyash", "Vaishnav", "Adesh", "Shreyash", "Nishant" };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Same String - " + arr[j]);
				}
			}

		}

	}

}
