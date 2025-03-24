package com.practive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Set<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp++;
				}

			}
			if (temp > 1) {
				list.add(a[i]);
			}
			
		}
		System.out.println(list);
	}

}
