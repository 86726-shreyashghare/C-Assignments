package com.shreyash;

public class Occurence {

	static void getOccuringChar(String str) {

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("The occurrence of " + str.charAt(i) + " -> " + count[str.charAt(i)]);
		}
	}

	public static void main(String args[]) {
		String str = "shreyashvikasghare";
		getOccuringChar(str);
	}
}