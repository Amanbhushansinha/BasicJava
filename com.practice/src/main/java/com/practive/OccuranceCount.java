package com.practive;

import java.util.Map;
import java.util.TreeMap;

import java.util.stream.Collectors;

public class OccuranceCount {
	public static void main(String[] args) {
		String input = "examplecharacters";

		Map<Object, Long> unsortedMap = input.chars()
				.mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));		
        	

		// Sort the map by key using TreeMap
		Map<Object, Long> sortedByKeyMap = new TreeMap<>(unsortedMap);
		System.out.println(sortedByKeyMap);
		
	}
		

}
