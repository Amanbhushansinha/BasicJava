/*
 * package com.practive;
 * 
 * import java.util.ArrayList; import java.util.HashSet; import java.util.List;
 * import java.util.Set; import java.util.stream.Collectors;
 * 
 * public class Test {
 * 
 * 
 * // List -> {"","bb","cc","dd"} // find the element "cc"
 * 
 * public static void main(String[] args) { List<String> list = new
 * ArrayList<>(); String fruit = "Apple";
 * 
 * list.add("aa"); list.add("ba"); list.add("ca"); list.add("cc");
 * 
 * List<Character> lfruit = null ; Set<Character> setFruit = new HashSet<>();
 * 
 * 
 * 
 * for(int i=0;i<fruit.length();i++) { char Chartemp = fruit.charAt(i); for (int
 * j=0;j<fruit.length();j++) { if(fruit.contains(fruit));
 * 
 * }
 * 
 * lfruit.add(fruit.charAt(i));
 * 
 * }
 * 
 * System.out.println(lfruit.stream() .filter(l-> !setFruit.add(l))
 * .collect(Collectors.toList());
 * 
 * 
 * 
 * System.out.println(list.stream().filter(l->l ==
 * "cc").collect(Collectors.toList())); } }
 */