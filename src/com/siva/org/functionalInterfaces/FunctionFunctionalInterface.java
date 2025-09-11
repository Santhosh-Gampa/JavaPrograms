/**
 * 
 */
package com.siva.org.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Function functional interface is one whose method accepts one argument and will return a value. 
 * A function functional interface is mainly used to get the processed value. 
 * For example, to get the square of an element, to trim string values, etc.
 */
public class FunctionFunctionalInterface {

	public static void main(String[] args) {

		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, Integer> squared = (value) -> value * value;
		
		List<Integer> squares = numbers.stream().map(squared).toList();
		
		squares.forEach(System.out::println);
		
	}

}
