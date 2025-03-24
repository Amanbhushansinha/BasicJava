package com.practive;

public class StringMethod {
	
	public static void main(String[] args) {
		String input = "    Aman Bhushan Sinha     mmm   mmmm   ";
		System.out.println(input);
		//remove Whit space
		System.out.println(input.strip());
		input.isBlank();
		System.out.println(input.repeat(2));
		System.out.println(input.stripTrailing());
	}

}
