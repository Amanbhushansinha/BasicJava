package com.practive;

public class ExceptionUsageClass {
	
	public static void main(String[] args) {
		int a=9;
		int b=10;
		if (a/b!=2) {
			throw new CustomeException();
		} else {
			System.out.println("Hi I am here :");
		}
	}

}
