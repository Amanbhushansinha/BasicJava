package com.practive;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		int input[] = { 9, 8, 6, 5, 4, 3, 2 };
		Arrays.sort(input);

		for (int i = 0; i < input.length; i++) {
			int j = i + 1;
			if (input[i] - input[j] != -1) {
				int a = input[i];
				++a;
				System.out.println("Missing no is " + a);
				System.exit(0);
			}

		}

	}
}
