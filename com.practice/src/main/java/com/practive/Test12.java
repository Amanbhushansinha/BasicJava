package com.practive;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test12 {
	
	//declare a list of strings and use stream 
	
//	to return a map having key value where the key should be the length of the string and value should be the the string itself.
		 
	
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 5, 12, 3, 8);
		System.out.println(nums.stream().sorted((a,b) -> Integer.compare(b, a)).findFirst());
		
		//System.out.println(nums.stream().sorted((a,b) -> Integer.compare(b,a)).findFirst());
		
		
		
		
		
	}
	
	
	

}
