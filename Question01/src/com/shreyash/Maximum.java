package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Array Elements - ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (max < arr[i])
				max = arr[i];

		}

		System.out.println("Maximun -> " + max);
	}
}
