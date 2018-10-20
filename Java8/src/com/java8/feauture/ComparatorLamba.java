package com.java8.feauture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLamba {

	public static void main(String[] args) {

//		Comparator<String> c = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				return Integer.compare(o1.length(), o2.length());
//			}
//
//		};
		
		Comparator<String> c1 = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());

		List<String> list = Arrays.asList("****", "**", "*", "***");

		Collections.sort(list, c1);

//		for (String s : list) {
//			System.out.println(s);
//		}
		
		//list.forEach(System.out::println);
		
		list.forEach(s -> System.out.println(s));
	}

}
