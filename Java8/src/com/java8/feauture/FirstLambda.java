package com.java8.feauture;

import java.io.File;
import java.io.FileFilter;


public class FirstLambda {

	public static void main(String[] args) {

//		FileFilter fileFilter = new FileFilter() {
//
//			@Override
//			public boolean accept(File pathname) {
//
//				return pathname.getName().endsWith(".java");
//
//			}
//		};
		
		FileFilter lamdaFilter = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("D:\\Practice\\algo\\src");
		
		File[] files = dir.listFiles(lamdaFilter);
		
		for (File f : files) {
			System.out.println(f);
		}
	}

}
