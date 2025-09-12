/**
 * 
 */
package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Using streams find the average of integer array elements.
 */
public class AverageofNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,3,6,7,8,9);
		
		double avg = numbers.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average of integer elements:"+avg );
	}

}
