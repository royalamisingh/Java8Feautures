package com.java8.feauture;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {

	public static List<Student> getStudentList(){
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student(1, "Amitabh", 31, "M"));
		l.add(new Student(2, "Abhishek",25, "M"));
		l.add(new Student(3, "Ivaan", 2, "M"));
		l.add(new Student(4, "Mini", 23, "F"));
		l.add(new Student(5, "Sony", 15, "F"));
		return l;    
	}
}
