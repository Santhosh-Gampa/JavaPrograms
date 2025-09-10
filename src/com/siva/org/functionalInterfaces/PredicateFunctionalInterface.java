package com.siva.org.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * A predicate functional interface is the one whose method accepts one argument and will return either true or false. 
 * A predicate functional interface is mainly used in comparison to sort elements or to filter a value 
 * based on certain condition(s) applied on the input passed.
 */

public class PredicateFunctionalInterface {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		/*
		 * Predicate<Integer> isEvenNumber = n -> n%2 == 0; numbers =
		 * numbers.stream().filter(isEvenNumber).toList();
		 * 
		 * numbers.forEach(System.out::println);
		 */
		
		numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
	}

}
