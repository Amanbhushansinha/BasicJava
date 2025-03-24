package com.practive;

public class ValidFormate {

	public static void main(String[] args) {
		String input = "111-000-3334";
		System.out.println(validFormate(input));
	}

	private static String validFormate(String input) {

		StringBuffer sb = new StringBuffer();
		// TODO Auto-generated method stub

		try {
			int first = Integer.parseInt(input.substring(0, 3));
			int second = Integer.parseInt(input.substring(4, 7));
			int third = Integer.parseInt(input.substring(8, 12));
			if (first < 0 || second < 0 || third < 0) {
				return "Invalid";
			}

			return "valid";
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return "Invalid";

		}

	}

}
