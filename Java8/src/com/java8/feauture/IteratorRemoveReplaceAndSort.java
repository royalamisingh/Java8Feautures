package com.java8.feauture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class IteratorRemoveReplaceAndSort {

	public static void main(String[] args) {
		Collection<String> strings = Arrays.asList("One", "Two","Three","Four");
		
		strings.forEach(System.out::println);
		
		Collection<String> list = new ArrayList<>(strings);
		
		boolean bool=list.removeIf(s -> s.length() > 4);
		
		System.out.println(list.stream().collect(Collectors.joining(" ,")));
		
		List<String> list1 = new ArrayList<>(strings);
		
		list1.replaceAll(String::toUpperCase);
		
		System.out.println(list1.stream().collect(Collectors.joining(" ,")));
		
		list1.sort(Comparator.naturalOrder());
		
		System.out.println(list1.stream().collect(Collectors.joining(" ,")));

	}

}
