package com.java8.feauture;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionSteps {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,4,3,2,7,8);
		
		Stream<Integer> stream = list.stream();
		
		BinaryOperator <Integer> sum = (i1,i2) -> i1 + i2;
		
		//int x = stream.reduce(0, sum);
		
		//System.out.println(x);
		
		Optional<Integer> o = stream.reduce((i1,i2) -> i1>i2?i1:i2);
		
		//Optional<Integer> o1 = stream.reduce(Integer::max);
		
		System.out.println(o);
		//System.out.println(o1);

	}

}
