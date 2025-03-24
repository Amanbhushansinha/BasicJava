package com.practive;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestElementInSorted {
	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {3,2,1,5,6,4};
		Arrays.sort(numbers);
		List<Integer> list = Arrays.asList(numbers);
		Scanner sc = new Scanner(System.in);
		System.out.println("The value u want:");
		int input =sc.nextInt();
		System.out.println("The largest value is :  " 
		+ list.get(list.size()-input));
		
	}

}
