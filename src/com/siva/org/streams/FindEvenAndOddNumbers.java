package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenAndOddNumbers {

	public static void main(String[] args) {

		List<Integer> nums =  Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		List<Integer> evens = nums.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
		evens.forEach(System.out::println);
		
		System.out.println("Odd Numbers:  ..");
		List<Integer> odds = nums.stream().filter(e -> e%2 != 0).collect(Collectors.toList());
		odds.forEach(System.out::println);
	}

}
