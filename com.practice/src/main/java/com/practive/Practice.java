package com.practive;

public class Practice {
	public static void main(String args[]) {
		String input = "mangom";
		int temp = 0;
		for (int i = 0; i < input.length(); i++) {
			char value = input.charAt(i);
			for (int j = 0; j < input.length(); j++) {
				if (value == input.charAt(j)) {
					++temp;
				}
			
			}
			if (temp == 1) {
				System.out.println("First non repeted value is :" + value);
				System.exit(0);
			}
			temp = 0;
			
			
			

		}
	}
}
