package com.practive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysSort {
	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {3,2,1,5,6,4};
		List<Integer> list = Arrays.asList(numbers);
		
		List<Integer> al = 
				list.stream().sorted().collect(Collectors.toList());
		System.out.println(al);
	}

}
