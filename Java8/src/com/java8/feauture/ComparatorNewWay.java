package com.java8.feauture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorNewWay {
	public static void main(String[] args) {
		  Student s = new Student(1, "Amitabh", 31, "M");
		  Student s1 = new Student(2, "Abhishek",25, "M");
		  Student s2 = new Student(3, "Ivaan", 2, "M");
		  
		  ArrayList<Student> l = (ArrayList<Student>) StudentUtils.getStudentList();
		  
		  l.add(s);l.add(s1);l.add(s2);
		  
		  l.forEach(System.out::println);
		  
		  Comparator comparator=Comparator.comparing(Student::getStudentname);
		  
		  l.forEach(System.out::println);
	}
}
