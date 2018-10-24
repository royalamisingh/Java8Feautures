package com.java8.feauture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergingMaps {

	public static void main(String[] args) {

		List<Student> stu = StudentUtils.getStudentList();

		stu.forEach(System.out::println);
		
		List<Student> list1 = stu.subList(0, 2);
		List<Student> list2 = stu.subList(2, stu.size());
		
		Map<String, List<Student>> map1 = getMapByGender(list1);
		
		System.out.println("Map 1");
		map1.forEach((gender,list) -> System.out.println( gender + " ->" + list));
		
		Map<String, List<Student>> map2 = getMapByGender(list2);
		
		System.out.println("Map 2");
		map2.forEach((gender,list) -> System.out.println( gender + " ->" + list));
		
		map2.entrySet().stream().forEach(entry -> map1.merge(entry.getKey(), entry.getValue(), (l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}));

		System.out.println("Map 1 Merged");
		map1.forEach((gender,list) -> System.out.println( gender + " ->" + list));
	}

	private static Map<String, List<Student>> getMapByGender(List<Student> stu) {
		Map<String, List<Student>> map = stu.stream().collect(Collectors.groupingBy(Student::getGender));
		return map;
	}
}
