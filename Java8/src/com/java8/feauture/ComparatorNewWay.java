package com.java8.feauture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorNewWay {
	public static void main(String[] args) {
		Student s = new Student(1, "Amitabh", 31);
		  Student s1 = new Student(2, "Abhishek", 24);
		  Student s2 = new Student(3, "Ivaan", 1);
		  
		  ArrayList<Student> l = new ArrayList<Student>();
		  
		  l.add(s);l.add(s1);l.add(s2);
		  
		  l.forEach(System.out::println);
		  
		  Comparator comparator=Comparator.comparing(Student::getStudentname);
		  
		  l.forEach(System.out::println);
	}
}
