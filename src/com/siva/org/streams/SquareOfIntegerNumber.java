package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;

public class SquareOfIntegerNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers =  Arrays.asList(10,3,20,30,40,0);
		
		double avg = numbers.stream()
			.map(e -> e*e)
				.filter(v -> v>100)
					.mapToInt(e -> e)
						.average().getAsDouble();
		
		System.out.println("Square  and Avg of Array elements are: "+avg);
				
	}

}
