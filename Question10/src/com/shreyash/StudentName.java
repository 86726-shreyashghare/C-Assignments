package com.shreyash;

import java.util.Arrays;

public class StudentName {

	public static void main(String[] args) {
		String arr[] = { "Shreyash", "Yash", "Vaishnav", "Adesh", "Nishant", "Sachin", "Ritesh", "Sid", "Ganesh",
				"Jd" };

		System.out.println("ArrayList - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		Arrays.sort(arr);
		System.out.println("\n\nArrayList After Sorting - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
