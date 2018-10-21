package com.java8.feauture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class ReadFiles {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader(new File("/Users/amitabhsingh/Desktop/Resumes/Amitabh K Singh.doc")));) {

			Stream<String> stream = reader.lines();
			stream.filter(line -> line.contains("Java")).findFirst().ifPresent(System.out::println);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
