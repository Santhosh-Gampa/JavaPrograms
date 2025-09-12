/**
 * 
 */
package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * This class will find the sum of integer array elements using reduce method.
 * 
 */
public class SumofIntegers {

	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
		System.out.println("sum: "+sum.get());
	}

}
