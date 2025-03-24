package com.practive;

import java.util.Scanner;

public class FirstandLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The String is : " + firstAndLast(sc.nextLine()));
	}

	private static String firstAndLast(String next) {
		if (next.charAt(0) == next.charAt(next.length() - 1)) {
			return "valid";
		} else {
			return "Invalid";
		}

	}

}
