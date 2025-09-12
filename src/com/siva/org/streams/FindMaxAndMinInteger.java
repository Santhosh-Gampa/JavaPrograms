package com.siva.org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Using stream API find max and min integer.
 */
public class FindMaxAndMinInteger {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,4,5,66,77,8,9,0,-1);
		
		
		int max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		int min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get() ;
		
		System.out.println("Max Integer: "+max);
		System.out.println("Min Integer: "+min);
		
	}

}
