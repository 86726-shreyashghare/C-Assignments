package com.shreyash;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		int english, maths, science, marathi, hindi;
		float percent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of all Subjects - ");
		english = sc.nextInt();
		maths = sc.nextInt();
		science = sc.nextInt();
		marathi = sc.nextInt();
		hindi = sc.nextInt();

		percent = ((english + maths + science + hindi + marathi) * 100) / 500;
		System.out.println("\nPercentage = " + percent);

		if (percent >= 90) {
			System.out.println("Grade = Excellent");
		} else if ((percent < 90) && (percent >= 80)) {
			System.out.println("Grade = A");
		} else if ((percent < 80) && (percent >= 70)) {
			System.out.println("Grade = B");
		} else if ((percent < 70) && (percent >= 60)) {
			System.out.println("Grade = C");
		} else if (percent < 60) {
			System.out.println("Grade = F ");
		}

	}

}
