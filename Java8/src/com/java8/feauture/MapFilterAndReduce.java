//take a List<Person> and return List<Integer>
package com.java8.feauture;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterAndReduce {
	public static void main(String[] args) {
          List<String> list= Arrays.asList("Hello", "How", "Are", "You");
          
          Stream<String> stream=list.stream();
          
          Predicate<String> p1= s -> s.length()>3;
          
          Predicate<String> p2 = Predicate.isEqual("Are");
          
          Predicate<String> p3 = Predicate.isEqual("How");
          
          Consumer<String> c1=s -> System.out.println(s);
          
          stream.filter(p2.or(p3)).forEach(c1);
	}
}
